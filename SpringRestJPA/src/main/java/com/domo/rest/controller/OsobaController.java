package com.domo.rest.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.domo.rest.osoba.Osoba;
import com.domo.rest.repo.OsobaRepo;


@RestController
public class OsobaController {
	
	
	@Autowired	
	OsobaRepo repo;

	
		@GetMapping("/osobe/{id}")
		public Optional<Osoba> searchById(@PathVariable("id") int id) {
			return repo.findById(id);
			
		}
	
		@GetMapping("/osobe")
		public List<Osoba> getAll() {
			List<Osoba> osobe = (List<Osoba>) repo.findAll();   // hocu da vuce iz db
			return osobe;
		
		


			
/*		List<Osoba> osobe = new ArrayList<>();                  // ili cr8 localne osobe
	
		Osoba o1 = new Osoba();
		o1.setId(01);
		o1.setFirstname("Ivica");
		o1.setLastname("Peric");
		o1.setVisina(185);
		o1.setTezina(80);
		o1.setEdukacija("Srednja skola");
		
		Osoba o2 = new Osoba();
		o2.setId(02);
		o2.setFirstname("Marko");
		o2.setLastname("Marulic");
		o2.setVisina(172);
		o2.setTezina(90);
		o2.setEdukacija("Srednja skola");
		
		Osoba o3 = new Osoba();
		o3.setId(03);
		o3.setFirstname("Petar");
		o3.setLastname("Zderic");
		o3.setVisina(190);
		o3.setTezina(83);
		o3.setEdukacija("Fakultet");
		
		Osoba o4 = new Osoba();
		o4.setId(04);
		o4.setFirstname("Mislav");
		o4.setLastname("Mesic");
		o4.setVisina(182);
		o4.setTezina(93);
		o4.setEdukacija("Srednja skola");
		
		Osoba o5 = new Osoba();
		o5.setId(05);
		o5.setFirstname("Josip");
		o5.setLastname("Josic");
		o5.setVisina(178);
		o5.setTezina(79);
		o5.setEdukacija("Fakultet");
		
		osobe.add(o1);
		osobe.add(o2);
		osobe.add(o3);
		osobe.add(o4);
		osobe.add(o5);      */
		

	}
	
}
