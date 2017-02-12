package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import impl.CustomerDAO;
import impl.Customer;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("CustomerDAO");
        Customer customer = new Customer(8, "KING",26);
        customerDAO.insert(customer);
    	
        Customer customer1 = customerDAO.findByCustomerId(1);
        System.out.println(customer1);
        
    }
}
