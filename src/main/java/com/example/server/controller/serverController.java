package com.example.server.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/control")
public class serverController {
	int index=0;
	
	@RequestMapping("/down")
	String down(@RequestParam String ip ,@RequestParam int port ) throws IOException {
		  System.out.println("down "+ ip+" "+port);
//		  try (PrintWriter fileOut = new PrintWriter("C:\\Users\\Lenovo\\Desktop\\New folder\\command.txt")) {
//			    fileOut.println(++index+",down");
//		  }
//	        // Connect to the server
	        Socket socket = new Socket( ip, port );

	        // Create input and output streams to read from and write to the server
	        PrintStream out = new PrintStream( socket.getOutputStream() );
	        BufferedReader in = new BufferedReader( new InputStreamReader( socket.getInputStream() ) );
	        out.print("down");
	       // Close our streams
	        in.close();
	        out.close();
	        socket.close();
	        return "DOWN";
    }
	
	@RequestMapping("/up")
    String up(@RequestParam String ip ,@RequestParam int port ) throws UnknownHostException, IOException {
		  System.out.println("up "+ ip+" "+port);
//		  try (PrintWriter fileOut = new PrintWriter("C:\\Users\\Lenovo\\Desktop\\New folder\\command.txt")) {
//			    fileOut.println(++index+",up");
//		  }
	        // Connect to the server
	        Socket socket = new Socket( ip, port );

	        // Create input and output streams to read from and write to the server
	        PrintStream out = new PrintStream( socket.getOutputStream() );
	        BufferedReader in = new BufferedReader( new InputStreamReader( socket.getInputStream() ) );
	        out.print("up");
	       // Close our streams
	        in.close();
	        out.close();
	        socket.close();
	        return "UP";


    }

	@RequestMapping("/right")
	String right(@RequestParam String ip ,@RequestParam int port ) throws UnknownHostException, IOException {
		  System.out.println("right "+ ip+" "+port);
//		  try (PrintWriter fileOut = new PrintWriter("C:\\Users\\Lenovo\\Desktop\\New folder\\command.txt")) {
//			    fileOut.println(++index+",right");
//		  }
		    
	        // Connect to the server
	        Socket socket = new Socket( ip, port );

	        // Create input and output streams to read from and write to the server
	        PrintStream out = new PrintStream( socket.getOutputStream() );
	        BufferedReader in = new BufferedReader( new InputStreamReader( socket.getInputStream() ) );
	        out.print("right");
	       // Close our streams
	        in.close();
	        out.close();
	        socket.close();
	        return "RIGHT";
    }
	@RequestMapping("/left")
	String left(@RequestParam String ip ,@RequestParam int port ) throws UnknownHostException, IOException {
		  System.out.println("left "+ ip+" "+port);
//		  try (PrintWriter fileOut = new PrintWriter("C:\\Users\\Lenovo\\Desktop\\New folder\\command.txt")) {
//			    fileOut.println(++index+",left");
//		  }
		    
//	         Connect to the server
	        Socket socket = new Socket( ip, port );

	        // Create input and output streams to read from and write to the server
	        PrintStream out = new PrintStream( socket.getOutputStream() );
	        BufferedReader in = new BufferedReader( new InputStreamReader( socket.getInputStream() ) );
	        out.print("left");
	       // Close our streams
	        in.close();
	        out.close();
	        socket.close();
	        return "LEFT";
    }
	
}
