package com.zsg.pizzad.web.dto;

import javax.validation.constraints.NotNull;

public class ToppingDto {

  @NotNull
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
