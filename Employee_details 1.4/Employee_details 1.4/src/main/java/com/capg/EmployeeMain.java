package com.capg;

import com.capg.config.JavaConfig;
import com.capg.entities.Employee;
import com.capg.service.IEmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class EmployeeMain {

    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        
        Class configurationClass= JavaConfig.class;
        context.register(configurationClass);
        context.refresh();
        context.registerShutdownHook();
       
        IEmployeeService service = context.getBean(IEmployeeService.class);
        List<Employee>employees= service.listAllEmployees();
        EmployeeMain emp=new EmployeeMain();
        emp.display(employees);
    }
    
    
    
   public void display(List<Employee> employees)
   {
    for (Employee employee:employees){
    	System.out.println("Employee info");
        System.out.println("EMPLOYEEID :"+employee.getId());
        System.out.println("EMPLOYEEName : "+employee.getName());
        System.out.println("EMPLOYEESalary :"+employee.getSalary());
    }

}
}