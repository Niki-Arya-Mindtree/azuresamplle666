package com.example.demo.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ClassStGtMeth;

@RestController
public class Control {
	
	@Autowired
	private JpaRepository jparepo;
	
	@GetMapping("/uss")
	public List<ClassStGtMeth> getAll(){
		
		return jparepo.findAll();
	}
	
	@PostMapping("/uss")
	public void saveAll(@PathVariable ClassStGtMeth stgt){
		jparepo.save(stgt);
	}


}
