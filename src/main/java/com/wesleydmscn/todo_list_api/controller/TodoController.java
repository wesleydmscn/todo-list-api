package com.wesleydmscn.todo_list_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodoController {

  @GetMapping
  public String helloWorld() {
    return "Hello Todo!";
  }
}
