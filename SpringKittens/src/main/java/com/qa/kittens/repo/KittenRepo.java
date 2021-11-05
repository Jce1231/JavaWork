package com.qa.kittens.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.kittens.domain.Kitten;

@Repository
public interface KittenRepo extends JpaRepository<Kitten, Integer> {
}
