package com.example.work.sample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SampleRepository extends JpaRepository<SampleModel, Integer>{ 

}
