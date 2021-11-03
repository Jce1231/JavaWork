package com.qa.kittens.service;

import java.util.List;

import com.qa.kittens.domain.Kitten;

public interface KittenService {
	Kitten getKitten(Integer id);
	List<Kitten> getKittens();
	Kitten createKitten(Kitten newKitten);
	Kitten updateKitten(Integer id,Kitten updatedKitten);
	boolean deleteKitten(Integer id);
}
