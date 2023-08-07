package com.example.work.test;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestModel, Integer>{
	
	
	//public TestModel findbyName(String name);

}
