package com.app.trello.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.trello.domain.Boards;

@Service
public class BoardsService {
	List<Boards> list=new ArrayList<>();
	public List<Boards> getBoards(){
		
		list.add(new Boards("hello",12));
		list.add(new Boards("world",13));
		list.add(new Boards("naren",18));
		
		return list;
		
		
	}
	
	public Boards getOneBoard(int boardId){
		for(Boards b: list){
			if(b.getId() == boardId) {
				return b;
			}
		}
		return null;
		
	}
}
