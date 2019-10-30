package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class FitnessService {

	@Autowired
	private FitnessRepository repo;

	public List<FitnessModel> listAll() {
		return repo.findAll();
	}

	public void Save(FitnessModel fitness) {
		repo.save(fitness);
	}

	public FitnessModel get(long id) {
		return repo.findById(id).get();
	}

	public void delete(long id) {
		repo.deleteById(id);
	}
}
