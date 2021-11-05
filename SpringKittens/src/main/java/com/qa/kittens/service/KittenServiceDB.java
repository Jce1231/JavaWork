package com.qa.kittens.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import com.qa.kittens.domain.Kitten;
import com.qa.kittens.repo.KittenRepo;

@Service
public class KittenServiceDB implements KittenService {
	private KittenRepo repo;

	/**
	 * @param repo
	 */
	public KittenServiceDB(KittenRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Kitten getKitten(Integer id) {
		return this.repo.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("A Kitten could not be found with ID :" + id));

	}

	@Override
	public List<Kitten> getKittens() {
		return this.repo.findAll();
	}

	@Override
	public Kitten createKitten(Kitten newKitten) {
		return this.repo.save(newKitten);
	}

	@Override
	public Kitten updateKitten(Integer id, Kitten updatedKitten) {
		Kitten curKit = this.getKitten(id);
		curKit.setBreed(updatedKitten.getBreed());
		curKit.setName(updatedKitten.getName());
		curKit.setWeight(updatedKitten.getWeight());
		return this.repo.save(curKit);
	}

	@Override
	public boolean deleteKitten(Integer id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
		// TODO Auto-generated method stub

	}

}
