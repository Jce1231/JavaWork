package com.qa.kittens.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.kittens.domain.Kitten;
import com.qa.kittens.service.KittenService;

@RestController
@RequestMapping("/cats")
public class KittenController {
	private KittenService service;

	public KittenController(KittenService service) {
		this.service = service;
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}

	@GetMapping("/get/{id}")
	public Kitten getKitten(@PathVariable Integer id) {
		return this.service.getKitten(id);
	}

	@GetMapping("/getAll")
	public List<Kitten> getKittens() {
		return this.service.getKittens();
	}

	@PostMapping("create")
	public ResponseEntity<Kitten> createKitten(@RequestBody Kitten newKitten) {
		Kitten responseBody = this.service.createKitten(newKitten);
		return new ResponseEntity<Kitten>(responseBody, HttpStatus.CREATED);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Kitten> updateKitten(@PathVariable Integer id, @RequestBody Kitten updatedKitten) {
		Kitten responseBody = this.service.updateKitten(id, updatedKitten);
		return new ResponseEntity<Kitten>(responseBody, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteKitten(@PathVariable Integer id) {
		Boolean removed = this.service.deleteKitten(id);
		if (removed) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
