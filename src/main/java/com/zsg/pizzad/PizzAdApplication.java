/*
 * Copyright (c) 2016 GE. All Rights Reserved.
 * GE Confidential: Restricted Internal Distribution
 */
package com.zsg.pizzad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class PizzAdApplication {

  @SpringBootApplication
  public static class WebApplication {

    public static void main(String[] args) {
      SpringApplication.run(WebApplication.class, args);
    }
  }
}
