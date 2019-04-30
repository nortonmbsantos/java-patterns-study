package com.norton.patterns_project.repository;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.norton.patterns_project.coffee.Coffee;

@Repository
public interface CoffeeRepository extends JpaRepository<Coffee, Long>  {

}
