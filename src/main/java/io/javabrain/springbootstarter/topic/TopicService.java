package io.javabrain.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("spring","Spring framework","Spring Framework Description"),
			new Topic("java","Core Java","Core Java Description"),
			new Topic("javascript","javaScript code","JavaScript Description")
			);
	
	public List<Topic> getAllTopic(){
		return topics;
	}

}
