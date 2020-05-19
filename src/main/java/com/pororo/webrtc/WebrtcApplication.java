package com.pororo.webrtc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebrtcApplication {
	// TODO : 웹캠, 마이크 권한 받고 그리기(navigator.webkitGetUserMedia) - client.js, index.html
	// TODO : RTC 통해 전송하면서 받기(Stun Server) - client.js
	//https://webrtc.github.io/samples/
	//https://www.tutorialspoint.com/webrtc/index.htm

	public static void main(String[] args) {
		SpringApplication.run(WebrtcApplication.class, args);
	}

}
