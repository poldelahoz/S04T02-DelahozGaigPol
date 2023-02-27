package cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.domain.Fruita;
import cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03.service.FruitaService;

@RestController
@RequestMapping("/api/v1")
public class FruitaController {
	
	@Autowired
	FruitaService fruitaService;
	
	@PostMapping("/fruita/add")
	public ResponseEntity<Fruita> addFruit(@RequestBody Fruita fruita) {
		try {
			return new ResponseEntity<>(fruitaService.saveFruita(fruita), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/fruita/update")
	public ResponseEntity<Fruita> updateFruit(@RequestBody Fruita fruita) {
		try {
			Fruita _fruita = fruitaService.updateFruita(fruita);
			if (_fruita != null) {
				return new ResponseEntity<>(_fruita, HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/fruita/delete/{id}")
	public ResponseEntity<HttpStatus> deleteFruit(@PathVariable("id") long id) {
		try {
			fruitaService.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/fruita/getOne/{id}")
	public ResponseEntity<Fruita> getFruitById(@PathVariable("id") long id) {
		try {
			Fruita fruita = fruitaService.getFruita(id);
			if (fruita != null) {
				return new ResponseEntity<>(fruita, HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/fruita/getAll")
	public ResponseEntity<List<Fruita>> getAllFruits() {
		try {
			List<Fruita> fruites = fruitaService.getFruitaList();
			if (fruites.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(fruites, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
