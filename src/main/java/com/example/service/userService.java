package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Door;
import com.example.model.User;
import com.example.model.Document;
import com.example.model.Room;
import com.example.model.Obstruction;

public interface userService { //differenciate the value of type like
	
	Obstruction saveObst(Obstruction shape);
	
    User saveUser(User user);
    
    List<User> getAllUser();

    Optional<User> findOne(Long id);

	void deleteUser(Long id);

	Room saveRoom(Room room);

	Door saveDoor(Door door);

	Document saveDocument(Document document);
	
	Optional<Document> getdoc(Long id);

	List<Document> getAllDocuments();

	Optional<Document> getByDocId(Long id);

	Room getRoom(long room_Id);
	
}
