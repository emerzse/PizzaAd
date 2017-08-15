package com.zsg.pizzad.service;/*
 * Copyright (c) 2016 GE. All Rights Reserved.
 * GE Confidential: Restricted Internal Distribution
 */

import com.zsg.pizzad.domian.Topping;
import com.zsg.pizzad.web.dto.ToppingDto;

public interface ToppingService {
  Topping create(ToppingDto topping);
  Topping findToppingById(int id);
}
