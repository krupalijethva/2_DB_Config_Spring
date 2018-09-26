package com.example.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.Door;
import com.example.model.User;
import com.example.model.Document;
import com.example.model.Room;
import com.example.model.Obstruction;
import com.example.repository.DocRepository;
import com.example.repository.DoorRepository;
import com.example.repository.ObstRepository;
import com.example.repository.RoomRepository;
import com.example.repository.userRepository;

@Service
@Transactional
public class userServiceImpl implements userService{

	@Autowired
	userRepository userRepository;
	
	@Autowired
	ObstRepository ObstRepository;
	
	@Autowired
	RoomRepository RoomRepository;
	
	@Autowired
	DoorRepository  DoorRepository;
	
	@Autowired
	DocRepository DocRepository;
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public Optional<User> findOne(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public void deleteUser(Long id) {
	userRepository.deleteById(id);
	}

	@Override
	public Obstruction saveObst(Obstruction shape) {
		// TODO Auto-generated method stub
		return ObstRepository.save(shape);
	}

	@Override
	public Room saveRoom(Room room) {
	
		// TODO Auto-generated method stub
		room=RoomRepository.save(room);
		
		//System.out.println("doc id=="+room.getDocument().getDoc_Id());
		
		return room;//RoomRepository.save(room);
	}

	@Override
	public Door saveDoor(Door door) {
		// TODO Auto-generated method stub
			
		return DoorRepository.save(door);
	}

	@Override
	public Document saveDocument(Document document) {
		
        String CurrentName = null;		
		CurrentName = document.getFilename();

		Document docTemp = new Document();
		docTemp = DocRepository.findFilename(CurrentName);

		if (docTemp == null) {
			docTemp = DocRepository.save(document);
		} else {
			System.out.println("======alreday Exists=====");
		}
		return docTemp;
		// TODO Auto-generated method stub
		//return DocRepository.save(document);
	}

	@Override
	public Optional<Document> getdoc(Long id) {	
		return DocRepository.findById(id);
	}

	@Override
	public List<Document> getAllDocuments() {
		System.out.println(DocRepository.findAll());
		// TODO Auto-generated method stub
		return DocRepository.findAll();
	}

	@Override
	public Optional<Document> getByDocId(Long id) {
		// TODO Auto-generated method stub
		return DocRepository.findById(id);
	}

	@Override
	public Room getRoom(long room_Id) {
		// TODO Auto-generated method stub
		return RoomRepository.getOne(room_Id);
	}
}
