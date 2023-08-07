package com.example.work.test;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TestServiceImpl implements TestService
{
	@Autowired
	TestRepository testRepo;

	public List<TestModel> getAllTestList() {
		// TODO Auto-generated method stub
		return testRepo.findAll();
	}

	public void saveTest(TestModel test) {
		// TODO Auto-generated method stub
		testRepo.save(test);
	}

	public void deleteTest(TestModel deleteTest) {
		// TODO Auto-generated method stub
		testRepo.delete(deleteTest);
	}

	public Optional<TestModel> findById(int id) {
		// TODO Auto-generated method stub
		return testRepo.findById(id);
	}

	public void deleteTestById(int deleteId) {
		// TODO Auto-generated method stub
		testRepo.deleteById(deleteId);
	}

}
