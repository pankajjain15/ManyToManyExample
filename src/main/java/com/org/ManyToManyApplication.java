package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.org.checkLists.CheckList;
import com.org.checkLists.ICheckListRepository;
import com.org.users.User;
import com.org.users.UserDAO;

@SpringBootApplication
@EnableAutoConfiguration
public class ManyToManyApplication implements CommandLineRunner{
	
	@Autowired
	UserDAO userDao;
	
	@Autowired
	ICheckListRepository checkRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(ManyToManyApplication.class, args);
	}

	public void run(String... args) throws Exception {
		User user = new User();
		user.setFirstName("panakj");
		user.setLastName("jain");
		
		
		CheckList list1=new CheckList();
		list1.setCheckListName("Machine1");
		 
		CheckList list2=new CheckList();
		list2.setCheckListName("Machine2");
		
		user.getCheckList().add(list1);
		user.getCheckList().add(list2);
		
		list1.getUsers().add(user);
		list2.getUsers().add(user);
		
		userDao.save(user);
		checkRepo.save(list1);
		checkRepo.save(list2);
	}

}
