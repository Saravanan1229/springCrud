package com.example.work.sample;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.work.test.TestModel;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
@Transactional
public class SampleService1 implements SampleService {
     @Autowired
	SampleRepository sampleRepo;
	@Override
	public List<SampleModel> getAllSampleList() {
		// TODO Auto-generated method stub
		return sampleRepo.findAll();
	}
	@Override
	public void saveSample(SampleModel sample) {
		sampleRepo.save(sample);
	}
	
	@Override
	public void deleteSample(SampleModel deleteSample) {
		sampleRepo.delete(deleteSample);
	}

	@Override
	public java.util.Optional<SampleModel> findById(int id) {
		// TODO Auto-generated method stub
		return sampleRepo.findById(id);
	}
	@Override
	public void deleteSampleById(int deleteId) {
		// TODO Auto-generated method stub
		sampleRepo.deleteById(deleteId);
	}


}
