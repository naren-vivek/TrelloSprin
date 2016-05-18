package com.app.trello.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.trello.domain.Boards;
import com.app.trello.spring.services.BoardsService;


@RestController
@RequestMapping("/header")
public class BoardController {
	@Autowired
	BoardsService boardsService;
	
	@RequestMapping(method=RequestMethod.GET,value="/board")
	public ResponseEntity<List<Boards>> index(){
		
		List <Boards> board= boardsService.getBoards();
		return new ResponseEntity<List<Boards>>(board, HttpStatus.OK);

	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{boardId}")
	public ResponseEntity<Boards> getOne(@PathVariable int boardId){
		
		Boards board=boardsService.getOneBoard(boardId);
		
		return new ResponseEntity<Boards>(board,HttpStatus.OK);
	}
	
}
