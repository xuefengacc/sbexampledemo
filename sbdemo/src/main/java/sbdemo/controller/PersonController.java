package sbdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sbdemo.model.Person;
import sbdemo.srevice.PersonServiceImpl;

@RestController
public class PersonController {

	@Autowired
    protected PersonServiceImpl perService;

	@GetMapping("/persons")
	public ResponseEntity<List<Person>> getPerson(){
		
		return new ResponseEntity<List<Person>>(perService.getAllPerson(), HttpStatus.OK);
	}
	
	@PostMapping("/addperson")
	public void insertPerson(@RequestBody Person person) {
	
		perService.savePerson(person);
	}
	
}
