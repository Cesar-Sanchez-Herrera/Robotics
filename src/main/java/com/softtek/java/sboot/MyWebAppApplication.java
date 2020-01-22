package com.softtek.java.sboot;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.softtek.java.sboot.beans.Products;

@SpringBootApplication
public class MyWebAppApplication implements CommandLineRunner{
	

	public static void main(String[] args) {
		SpringApplication.run(MyWebAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
