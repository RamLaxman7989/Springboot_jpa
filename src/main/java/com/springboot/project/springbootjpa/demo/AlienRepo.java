package com.springboot.project.springbootjpa.demo;

import org.springframework.data.repository.CrudRepository;

import com.springboot.project.springbootjpa.model.Alien;

public interface AlienRepo extends CrudRepository<Alien,Integer>
{

}
