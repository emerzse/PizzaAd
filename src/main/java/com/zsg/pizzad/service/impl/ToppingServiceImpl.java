/*
 * Copyright (c) 2016 GE. All Rights Reserved.
 * GE Confidential: Restricted Internal Distribution
 */
package com.zsg.pizzad.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsg.pizzad.domian.Topping;
import com.zsg.pizzad.repository.ToppingRepository;
import com.zsg.pizzad.service.ToppingService;
import com.zsg.pizzad.web.dto.ToppingDto;

@Service
@Transactional
public class ToppingServiceImpl implements ToppingService {

  @Autowired
  private ToppingRepository toppingRepository;

  @Override
  public Topping create(ToppingDto topping) {
    Topping t = new Topping(topping.getName());
    return toppingRepository.save(t);
  }

  @Override
  public Topping findToppingById(int id) {
    return toppingRepository.findOne(id);
  }
}
