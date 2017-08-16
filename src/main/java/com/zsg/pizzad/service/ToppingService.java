package com.zsg.pizzad.service;

import com.zsg.pizzad.domian.Topping;
import com.zsg.pizzad.web.dto.ToppingDto;

public interface ToppingService {
  Topping create(ToppingDto topping);
  Topping findToppingById(int id);
}
