package com.zsg.pizzad.repository;/*
 * Copyright (c) 2016 GE. All Rights Reserved.
 * GE Confidential: Restricted Internal Distribution
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zsg.pizzad.domian.Topping;

@Repository
public interface ToppingRepository extends CrudRepository<Topping, Integer>{

}
