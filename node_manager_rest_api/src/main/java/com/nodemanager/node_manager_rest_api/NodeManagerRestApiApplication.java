package com.nodemanager.node_manager_rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Because of @SpringBootApplication Anotation -Application will start from here
@SpringBootApplication
public class NodeManagerRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NodeManagerRestApiApplication.class, args);
	}

}
