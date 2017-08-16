package com.zsg.pizzad.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zsg.pizzad.domian.Topping;

@Repository
public interface ToppingRepository extends CrudRepository<Topping, Integer>{

}
