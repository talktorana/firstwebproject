package com.rana.firstweb.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rana.firstweb.model.Superhero;

@Controller
@RequestMapping("/superhero")
public class SuperheroController {

	@RequestMapping
	public ModelAndView getSuperheroes() {
	  return new ModelAndView("superheroes", "superheroes", Arrays.asList(
	     new Superhero("Clark", "Kent", "Superman", true),
	     new Superhero("Siobhan", "McDougal", "Silver Banshee", false)
	  ));
	}
}
