package io.start.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class topicController {
	
	@Autowired
	private topicService topicfirst;

	
	@RequestMapping("/topics")
	public List<topics> getTopics()
	{
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{fool}")
	public topics getTopic(@PathVariable("fool") String id)
	{
		return topicService.getTopic(id);
	}
	//Creating a new id as a list
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody topics newtop)
	{
		topicService.addTopic(newtop);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody topics newtop, @PathVariable String id)
	{
		topicService.updateTopic(id, newtop);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		topicService.deleteTopic(id);
	}
}
