package com.example.work.sample;

import java.util.List;
import java.util.Optional;

import com.example.work.test.TestModel;



public interface SampleService {
	List<SampleModel> getAllSampleList();
	
	void saveSample(SampleModel Sample);
	
	void deleteSample(SampleModel deleteSample);
	
	void deleteSampleById(int deleteId);
	
	Optional<SampleModel> findById(int id);
}
