package com.example.work.sample;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SampleController {
	@Autowired 
	SampleService sampleService;
	
    @RequestMapping(value="/getSample",method = RequestMethod.GET)
    public List<SampleModel> getList()
    {
    	System.out.println(sampleService.getAllSampleList());
    	return sampleService.getAllSampleList();
    }
    
    @RequestMapping(value="/saveSample",method =RequestMethod.POST)
    public void saveSample(@RequestBody SampleModel sample)
    {
    	sampleService.saveSample(sample);
    }
    
	@RequestMapping(value="/updateSample1",method =RequestMethod.PUT)
	public String updateSample(@PathVariable ("id") String id, @RequestBody
	SampleModel product) {
		return id;
    
	}
	
	
	@RequestMapping(value="/updateSample", method = RequestMethod.PUT)
	public String sampleUpdate(@RequestBody SampleModel sampleUpdate)
	{
		Optional<SampleModel> opt = sampleService.findById(sampleUpdate.getId());
		if(!opt.isEmpty())
		{
			sampleService.saveSample(sampleUpdate);
			return "update successfully..!";
		}else
		{
			return "data not found & update failure..!";
		}
		
		
	}
	
	
	
	@RequestMapping(value="/deleteSample", method = RequestMethod.DELETE)
	public String deleteSample(@RequestBody SampleModel deleteSample)
	{
		Optional<SampleModel> opt = sampleService.findById(deleteSample.getId());
		if(!opt.isEmpty())
		{
			sampleService.deleteSample(deleteSample);
			return "deleted successfully..!";
		}else
		{
			return "data not found & deleted failure..!";
		}
		
	}
		@RequestMapping(value="/deleteSampleById/{deleteId}", method = RequestMethod.DELETE)
		public String deleteSample(@PathVariable("deleteId") int deleteId)
		{
			Optional<SampleModel> opt =sampleService.findById(deleteId);
			if(!opt.isEmpty())
			{
				sampleService.deleteSampleById(deleteId);
				return "deleted successfully by ID.";
			}else {
				return "data not found & deleted by id failure..!";
			}
		}
}
		
		 


    

