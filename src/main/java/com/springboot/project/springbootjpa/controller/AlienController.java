package com.springboot.project.springbootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.project.springbootjpa.demo.AlienRepo;
import com.springboot.project.springbootjpa.model.Alien;


@Controller
	public class AlienController
	{
	    @Autowired
	    
	    AlienRepo repo;
	    @RequestMapping("/")
	    public String home()
	    {
	        return "Home.jsp";
	    }
	    @RequestMapping("/addAlien")
	    public String addAlien(Alien alien)
	    {
	        repo.save(alien);
	        return "Home.jsp";
	    }
	    



	}
