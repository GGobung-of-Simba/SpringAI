package com.java;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController

public class OllamaController {
	
	private final ChatClient chatClient;
	
	public OllamaController(ChatClient.Builder chatClient) {
		this.chatClient = chatClient.build();
	}
	
	@GetMapping("/")
	public String home() {
		return chatClient.prompt()
				.user("hi")
				.call()
				.content();
	}
	

}
