package io.start.topic;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class topicService {

	
	private static List<topics> newTopic = new ArrayList<>(Arrays.asList(
			new topics("1","Zero to one","Self help"),
			new topics("2","Who will cry, when u die","Self help"),
			new topics("3","A monk, who sold his ferrai","Self help"),
			new topics("4","Ponniyan Selvan", "NovalS")
			
			));
	public static  List<topics> getAllTopics()
	{
		return newTopic;
	}
	
	public static topics getTopic(String id)
	{
		return newTopic.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public static void addTopic(topics newtop) {
		newTopic.add(newtop); 
	}

	public static void updateTopic(String id, topics newtop) {
		for(int i=0;i<newTopic.size();i++)
		{
			topics t = newTopic.get(i);
			if(t.getId().equals(id))
			{
				newTopic.set(i, newtop);
				return;
			}
		}
		
	}

	public static void deleteTopic(String id) {
		
		for(int i=0;i<newTopic.size();i++)
		{
			topics t = newTopic.get(i);
			if(t.getId().equals(id))
			{
				newTopic.remove(i);
			}
		}
	}
	
	
}
