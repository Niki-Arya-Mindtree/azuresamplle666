package com.example.demo.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ClassStGtMeth;

@RestController
public class Control {
	
	@Autowired
	private JpaRepository jparepo;
	
	@GetMapping("/usseer")
	public List<ClassStGtMeth> getAll(){
		return jparepo.findAll();
//		return jparepo.findAll();
	}
	
	@PostMapping("/usseer")
	public void saveAll(@RequestBody ClassStGtMeth stgt){
		jparepo.saveAndFlush(stgt);
		//jparepo.save(stgt);
	}


}
