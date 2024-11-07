package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.beans.WishMassegeGenerate;

@SpringBootApplication
public class SprinBoot01ProjApplication {
	
	@Bean("ldt")
	public LocalDateTime createLDT()
	{
		return LocalDateTime.now();
	}
	
	
	public static void main(String[] args) {
		   ApplicationContext    ctx =   SpringApplication.run(SprinBoot01ProjApplication.class, args);
		   
		   WishMassegeGenerate      generate=    ctx.getBean("wsg",WishMassegeGenerate.class);
		   
		  String   msg = generate.generatemassage("raja");
		  
		  System.out.println(" Result Msg::"+msg);
		
		
		
	}

}
