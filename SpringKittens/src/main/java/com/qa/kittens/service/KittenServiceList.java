package com.qa.kittens.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.kittens.domain.Kitten;
@Service
public class KittenServiceList implements KittenService {
	
	private List<Kitten> kittens = new ArrayList<>();
	public Kitten getKitten(Integer id) {
		return this.kittens.get(id);
	}
	public List<Kitten> getKittens(){
		return this.kittens;
	}
	public Kitten createKitten(Kitten newKitten) {
		this.kittens.add(newKitten);
		return this.kittens.get(kittens.size()-1);
	}
	public Kitten updateKitten(Integer id,Kitten updatedKitten) {
		this.kittens.set(id,updatedKitten);
		return this.kittens.get(id);
	}

	public boolean deleteKitten(Integer id){
		Kitten toRemove = this.kittens.get(id);
		this.kittens.remove(id.intValue());
		this.kittens.remove((int)id);
		return !this.kittens.contains(toRemove);
	}

}
