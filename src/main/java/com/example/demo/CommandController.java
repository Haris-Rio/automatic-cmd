package com.example.demo;
import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandController {
	
	//final String location ="C:\\Users\\haris.kumar.b\\Documents\\flag\\cmd-commands\\src\\main\\resources";
	@RequestMapping(value = "/command")
	public void OpenClose() throws InterruptedException {
		
		try {
			Runtime.getRuntime().exec("cmd /c \"start commands.bat && cmd.exe\""/* ,null,new File(location) */);
			
			Thread.sleep(11000);
			
			Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
