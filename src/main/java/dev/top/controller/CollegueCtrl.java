package dev.top.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dev.top.entities.Collegue;
import dev.top.repos.CollegueRepo;

@RestController()
@RequestMapping("/collegues")
public class CollegueCtrl {

	private CollegueRepo collegueRepo;

	public CollegueCtrl(CollegueRepo collegueRepo) {
		super();
		this.collegueRepo = collegueRepo;
	}

	@GetMapping
	public List<Collegue> findAll() {
		return this.collegueRepo.findAll();
	}

	@PatchMapping("/{nom}")
	public @ResponseBody ResponseEntity<Collegue> patch(@PathVariable String nom, @RequestBody String avis){
		if ("AIMER".equals(avis)){
		}
		if ("DETESTER".equals(avis)){
		}
		return new ResponseEntity<Collegue>(new Collegue(), HttpStatus.OK);
	}
}