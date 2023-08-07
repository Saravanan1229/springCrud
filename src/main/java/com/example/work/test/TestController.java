package com.example.work.test;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.work.user.User1;
import com.example.work.user.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TestController {
	
	@Autowired
	TestService testService;
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/")
	public String process()
	{
		return "hello";
		
	}
	
	@RequestMapping(value="/getTest", method = RequestMethod.GET)
	public List<TestModel> getList()
	{
		//System.out.println(testService.getAllTestList());
		return testService.getAllTestList();	
	}   
	
	
	@RequestMapping(value="/saveTest", method = RequestMethod.POST)
	public void saveTest(@RequestBody TestModel test)
	{
		testService.saveTest(test);
	}
	
//	@RequestMapping(value="/login", method = RequestMethod.POST)
//	public String TestModel(@RequestBody String email, String pass)
//	{
//		
//		String error="";
////		
////		
////		if()
////		return 	msg;
////	} 
////	
//	
//	      if (email==pass) { 
//	         error = "Invalid username and password!"; 
// 
//	     } else { 
//	         error = "Invalid username and password!"; 
//	      } 
//	      return error;
//	   }
	
	
//	
//	@RequestMapping(value="/updateTest",method =RequestMethod.PUT)
//	public void updateTest=testRepository.findById(id)
//	
//	{
//		Object updateTest;
//		Object test;
//		updateTest.setname(test.getname);
//		
//		test.Repository.save(updateTest);
//		return Repository.ok(updateTest);
	
	
//	}
	
	
	@RequestMapping(value="/updateTest1",method =RequestMethod.PUT)
	public String updateTest(@PathVariable ("id") String id, @RequestBody
	TestModel product) {
		return id;
	
	}
	
	@RequestMapping(value="/updateTest", method = RequestMethod.PUT)
	public String testUpdate(@RequestBody TestModel testUpdate)
	{
		Optional<TestModel> opt = testService.findById(testUpdate.getId());
		if(!opt.isEmpty())
		{
			testService.saveTest(testUpdate);
			return "update successfully..!";
		}else
		{
			return "data not found & update failure..!";
		}
		
		
	}
	
	@RequestMapping(value="/deleteTest", method = RequestMethod.DELETE)
	public String deleteTest(@RequestBody TestModel deleteTest)
	{
		Optional<TestModel> opt = testService.findById(deleteTest.getId());
		if(!opt.isEmpty())
		{
			testService.deleteTest(deleteTest);
			return "deleted successfully..!";
		}else
		{
			return "data not found & deleted failure..!";
		}
		
	}
	
	@RequestMapping(value="/deleteTestById/{deleteId}", method = RequestMethod.DELETE)
	public String deleteTest(@PathVariable("deleteId") int deleteId)
	{
		Optional<TestModel> opt = testService.findById(deleteId);
		if(!opt.isEmpty())
		{
			testService.deleteTestById(deleteId);
			return "deleted successfully by ID..!";
		}else
		{
			return "data not found & deleted by id failure..!";
		}
		
	}
	
	 }

	


