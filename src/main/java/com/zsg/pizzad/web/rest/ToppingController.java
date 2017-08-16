package com.zsg.pizzad.web.rest;

import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zsg.pizzad.domian.Topping;
import com.zsg.pizzad.service.ToppingService;
import com.zsg.pizzad.web.dto.ToppingDto;

@RestController
public class ToppingController {

  private static final Logger LOOGER = LoggerFactory.getLogger(ToppingController.class);
  @Autowired
  private ToppingService toppingService;

  @RequestMapping(value = "/post", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Topping> postTopping(@Validated @RequestBody ToppingDto dto) {
    LOOGER.info("Api request received");

    ResponseEntity<Topping> response;
    Topping topping = toppingService.create(dto);

    if (topping != null) {
      response = new ResponseEntity<>(topping, HttpStatus.OK);
    } else {
      response = new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    return response;
  }

  @RequestMapping(value = "/searchname", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Topping> getToppingName(@Validated @NotNull @RequestParam(name = "id") String id) {
    ResponseEntity<Topping> response;

    Topping topping = toppingService.findToppingById(Integer.parseInt(id));

    if (topping != null) {
      response = new ResponseEntity<>(topping, HttpStatus.OK);
    } else {
      response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    return response;
  }
}
