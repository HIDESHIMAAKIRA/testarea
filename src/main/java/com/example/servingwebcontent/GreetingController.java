package com.example.servingwebcontent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.accessingdatamysql.actor;

@Controller
public class GreetingController {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
	
	//http://localhost:8080/
	
    String query = "SELECT * from actor";
    List<actor> customer = jdbcTemplate.query(query, new BeanPropertyRowMapper<>(actor.class));
	
	model.addAttribute("name", name);
	model.addAttribute("DB", customer.toString());

	//C:\Users\seven> net stop mysql83
	//C:\Users\seven> net start mysql83

		return "greeting";
	}

}