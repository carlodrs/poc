package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Client;
import com.example.demo.service.ClientService;

/**
 * Classe Controller que expoe as apis da aplicao.
 * @author carlos silva
 * @since 2022
 * @version 1.0
 * 
 * */
@Controller
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientService service;
	
	@GetMapping(value = "/getClients")
	public ResponseEntity<List<Client>> getClients(){
		return ResponseEntity.ok(service.getClients());	
	}
	

	/** Listar pelo nome dos planetas
	 * @return Client
	 */
	@GetMapping(value = "/getClient/{name}")
	public ResponseEntity<Client> getClient (@PathVariable String name) {		
		Client client =  service.getClient(name);
		return ResponseEntity.ok().body(client);
	}
}
