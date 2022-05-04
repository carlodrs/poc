package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Client;

@Service
public class ClientService {

	private static ArrayList<Client> clients = new ArrayList<>();
	
	public ClientService() {
	
		Client c1 = new Client();
	    c1.setId("1");
		c1.setName("Carlos");
		

		Client c2 = new Client();
	    c2.setId("2");
		c2.setName("Anderson");
		
		
		Client c3 = new Client();
	    c3.setId("3");
		c3.setName("Wander");
		
		
		clients.add(c1);
		clients.add(c2);
		clients.add(c3);
	}

	public List<Client> getClients() {
		return clients;
	}

	public Client getClient(String name) {
		for (Iterator<Client> iterator = clients.iterator(); iterator.hasNext();) {
			Client client = (Client) iterator.next();
			if (client.getName().equalsIgnoreCase(name))
				return client;
		}
		
		return new Client();
	}
}
