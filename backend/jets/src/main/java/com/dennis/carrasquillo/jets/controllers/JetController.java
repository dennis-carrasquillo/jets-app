package com.dennis.carrasquillo.jets.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dennis.carrasquillo.jets.entities.Jet;
import  com.dennis.carrasquillo.jets.exceptions.ResourceNotFoundException;
import com.dennis.carrasquillo.jets.repos.JetRepo;

/**
 * HTTP Controller for {@link Jet}
 * @author dennis carrasquillo
 *
 */
@RestController
@RequestMapping("/api/v1/jets")
public class JetController {
	@Autowired
	private JetRepo jetRepository;

	
	/**
	 * HTTP GET {@link Jet} by Id
	 * @return List of Jets
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/")
	public List<Jet> getAllJets() {
		return jetRepository.findAll();
	}
	
	
	/**
	 * HTTP POST Create {@link Jet}
	 * @param jet
	 * @return jet
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/")
	public Jet createJet(@RequestBody Jet jet) {
		return jetRepository.save(jet);
	}
	
	
	/**
	 * HTTP GET {@link Jet} by id
	 * @param id
	 * @return Jet
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/{id}")
	public ResponseEntity<Jet> getJetById(@PathVariable int id) {
		Jet jet = jetRepository
				.findById(id).orElseThrow(()-> new ResourceNotFoundException("The Jet with this id: " + id + " does not exist!"));
		return ResponseEntity.ok(jet);
	}
}
