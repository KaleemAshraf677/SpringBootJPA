package com.springboot.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
      
ConfigurableApplicationContext context=SpringApplication.run(SpringBootJpaApplication.class, args);
	      UserRepository userRepo=context.getBean(UserRepository.class);
	    
/*	//  Create table and Insert data    
	      //object 1
	      User u1=new User();
	      u1.setName("Kaleem Ashraf");
	      u1.setCity("Lucknow");
	      u1.setStatus("I am a Java Developer");
	      
	       saving single object
	      User user=userRepo.save(u1);
	      userRepo.save(u1);
	      System.out.println(u1);  
	      
	      //object 2
	      User u2=new User();
	      u2.setName("Sifat Zehra");
	      u2.setCity("Ambedkar Nagar");
	      u2.setStatus("She is a .NET Developer");
	      
	      //object 3
	      User u3=new User();
	      u3.setName("Amman Siddique");
	      u3.setCity("Lucknow");
	      u3.setStatus("He is a senior Executive");
	     
	     List<User> users = List.of(u1,u2,u3);
	       
	       userRepo.saveAll(users);
	       
	       //show data in your spring output screen.(call toString method or Manually print data)
	     
	         System.out.println(users);
	         
	//   Iterable<User> result = userRepo.saveAll(users);
	     
	 //    for(User e:result) {
	   // 	 System.out.println(e);
	    // }      
     
*/  
	      //update         (user id=3)
	      
	/*    Optional<User> optional  = userRepo.findById(3);
	         User user=optional.get();
	        // System.out.println(user);
	         
	         user.setName("Mohammad Ashraf");
	         
	         userRepo.save(user);
	         System.out.println(user);      */
	         
/*	      // Fetch data(Select Operation)
	         
	         Iterable<User> data=userRepo.findAll();
	         for(User e:data) {
	        	 System.out.println(e);
	         }     */
	         
	         //delete data
	         
	     //    userRepo.deleteById(3);
	      
	      // custom finder or fetch data
	      
/*	      List<User> data= userRepo.findByNameAndCity("Kaleem Ashraf","Lucknow");
	      for(User e:data) {
	    	  System.out.println(e);
	      }       */
	          
	      // Fetch Data using native query or JPQL Query
	      
	  /*    List<User> users= userRepo.getAllUser();
	      for(User e:users) {
	    	  System.out.println(e);
	      }    */
	      
	     
	       
	/*      List<User> fetch = userRepo.getUserByName("Kaleem Ashraf","Lucknow");
	      for(User e: fetch) {
	    	  System.out.println(e);
	      }   */
	      
	      
	      // native query (SQL Query)
	      List<User> list=userRepo.getUsers();
	      for(User e: list) {
	    	  System.out.println(list);
	      }
	      
	}

}
