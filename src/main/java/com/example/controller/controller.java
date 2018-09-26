package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Door;
import com.example.model.User;
import com.example.model.WorkTableModel;
import com.example.model.Document;
import com.example.model.Room;
import com.example.model.Obstruction;
import com.example.service.WorkTableModelService;
import com.example.service.userService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")

public class controller {

	@Autowired
	userService service;

	@Autowired
	WorkTableModelService workTableModelService;

	@GetMapping("/JobTagById")
	public Optional<WorkTableModel> loadDocById(@RequestParam(value = "id") Long id) {
		Optional<WorkTableModel> customerDetail = workTableModelService.findById(id);
		// System.out.println(customerDetail.toString());
		return customerDetail;
	}

	@GetMapping("/AllCustomeProduct")
	public List<WorkTableModel> AllCustomeProduct() {
		List<WorkTableModel> workTableModels = workTableModelService.findAllCustomProduct();
		System.out.println(workTableModels.toString());
		return workTableModels;
	}

	@GetMapping("/loadDocById")
	public Document loadDocById(@RequestParam(value = "id") long id) {

		Optional<Document> document = service.getByDocId(id);

		System.out.println(document.isPresent());

		Document doc =null;
		if (document.isPresent()) {

			doc = document.get();

//			System.out.println(doc.getObstructions());
//			Set<Door> doorSet = doc.getDoors();
//			Set<Room> rooms = doc.getRooms();
//			Set<Obstruction> obstructions = doc.getObstructions();
//
//			// for (Door door : doorSet) {
//			// System.out.println(door.getDoor_Id());
//			// System.out.println(door.getHeight());
//			// }
//			doc.setDoors(doorSet);
//			doc.setRooms(rooms);
//			doc.setObstructions(obstructions);
			
		}
		System.out.println(doc.toString());
		//
		// if (!doorSet.isEmpty()) {
		// System.out.println("*** door Details ***");
		// for (Door door : doorSet) {
		// System.out.println(door.getDoor_Id());
		// System.out.println(door.getHeight());
		// }
		// document.setDoors(doorSet);
		// }
		return doc;
	}

	@GetMapping("/loadDocument") // get all docs
	public List<Document> loadDocument() {
		List<Document> documents = service.getAllDocuments();
		System.out.println("in documents" + documents.toString());
		return documents;
	}

	@PostMapping("/saveDocument")
	public Document createDocumentFile(@RequestBody Document document) {
		Document doc = service.saveDocument(document);
		System.out.println(doc);
		System.out.println("save doc");
		return doc;
	}

	@PostMapping("/saveObst") // save user
	public void createShapes(@RequestBody Obstruction obstruction, @RequestParam(value = "docid") long docid) {
		Optional<Document> doc = service.getdoc(docid);

		Document document = null;
		if (doc.isPresent()) {

			document = doc.get();
			System.out.println("==== user obj====" + document);
			// ... use customer ...
		}

		obstruction.setDocument(document);

		service.saveObst(obstruction);
		System.out.println("save Obst");
	}

	@PostMapping("/saveRoom") // save user
	public Room createRoom(@RequestBody Room room, @RequestParam(value = "docid") long docid) {

		Optional<Document> doc = service.getdoc(docid);

		Document document = null;
		if (doc.isPresent()) {

			document = doc.get();
			System.out.println("==== user obj====" + document);
			// ... use customer ...
		}
		room.setDocument(document);
		Room room1 = service.saveRoom(room);
		System.out.println("save room");
		return room1;
	}

	@PostMapping("/saveDoor")
	public void createDoor(@RequestBody Door door, @RequestParam(value = "docid") long docid,
			@RequestParam(value = "room_Id") long room_Id) {

		System.out.println(door.getLeft());
		System.out.println(door.getTop());

		Optional<Document> doc = service.getdoc(docid);

		Document document = null;
		if (doc.isPresent()) {

			document = doc.get();
			System.out.println("==== user obj====" + document);
			// ... use customer ...
		}

		Room room = service.getRoom(room_Id);

		door.setRoom(room);

		door.setDocument(document);

		service.saveDoor(door);
		System.out.println("save door");
	}

	@PostMapping("/user") // save user
	public void createUser(@RequestBody User user) {
		service.saveUser(user);
		System.out.println("save user");
	}

	@GetMapping("/users") // get all user
	public List<User> getAllUser() {
		List<User> users = service.getAllUser();
		return users;
	}

	@GetMapping("/user/{id}")
	public Optional<User> getUser(@PathVariable Long id) {
		System.out.println("id from jsp apge" + id);
		Optional<User> e1 = service.findOne(id);
		if (e1 != null) {
			return e1;
		} else {
			return null;
		}
	}

	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {

		System.out.println("id update from jsp:" + id);

		System.out.println("last name" + user.getUserName());

		// User user1 = this.getUser(id);
		Optional<User> us = service.findOne(id);

		User user1 = null;

		if (us.isPresent()) {

			user1 = us.get();
			System.out.println("==== user obj  ====" + user1);
			// ... use customer ...
		} else {
			// ... deal with absence case ...
		}
		if (user1 == null) {
			return ResponseEntity.notFound().build();
		} else {
			user1.setUserName(user.getUserName());
			user1.setUserWork(user.getUserWork());
			User upemp = service.saveUser(user1);
			return ResponseEntity.ok().body(upemp);
		}
	}

	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable Long id) {
		service.deleteUser(id);
	}

	@GetMapping("/api/hi")
	public String hi() {
		return "Hello World from Restful API";
	}
}
