package com.org.users;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.org.checkLists.CheckList;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int userId;
	String firstName;
	String lastName;
	  
	@ManyToMany(mappedBy="users")
	Collection<CheckList>checkList=new HashSet<CheckList>();
	
	
	
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the checkList
	 */
	public Collection<CheckList> getCheckList() {
		return checkList;
	}
	/**
	 * @param checkList the checkList to set
	 */
	public void setCheckList(Collection<CheckList> checkList) {
		this.checkList = checkList;
	}

}
