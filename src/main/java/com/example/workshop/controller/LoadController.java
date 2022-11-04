package com.example.workshop.controller;

import com.example.workshop.model.Load;
import com.example.workshop.repositary.LoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/controller")
public class LoadController {
	@Autowired
	LoadRepository loadRepository;
	
	@PostMapping("/save")
	void save(@RequestBody Load load)
	{
		loadRepository.save(load);
	}
	
    @GetMapping("/get")
	List<Load> get()
	{
		Optional<List<Load>> loads= loadRepository.getAll();
		return loads.get();
		
	}

	@GetMapping("/get/{id}")
	Object get(@PathVariable("id") Integer id)
	{
		Optional<Load> loads= loadRepository.findByLoadId(id);
		return loads.get();

	}

	@DeleteMapping("/delete/{id}")
	void delete(@PathVariable("id") Integer id)
	{
		loadRepository.deleteById(id);

	}

	@PutMapping("/put")
	void put(@PathVariable("id") Integer id, @RequestBody Load loadDetails)
	{

		Load load = loadRepository.findById(id).get();

		load.setLoadingPoint(loadDetails.getLoadingPoint());
		load.setComment(loadDetails.getComment());
		load.setDate(loadDetails.getDate());
		load.setProductType(loadDetails.getProductType());
		load.setTruckType(loadDetails.getTruckType());
		load.setUnloadingPoint(loadDetails.getUnloadingPoint());
		load.setWeight(loadDetails.getWeight());

		Load updatedNote = loadRepository.save(load);

	}
}
