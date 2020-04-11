package com.cg.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class EmployeeMain {

    public static void main(String[] args) {
    	
    	EmployeeMain empmain=new EmployeeMain();
    	
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        
        Class configurationClass=JavaConfig.class;
        context.register(configurationClass);
        
        context.refresh();
       context.registerShutdownHook();
       
     
        SBU sbu=context.getBean(SBU.class);
      sbu.display();
    	
       
    }
    
    
}
