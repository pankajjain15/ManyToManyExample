package com.org.checkLists;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import com.org.users.User;

@Entity
public class CheckList {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int checkListId;
	String checkListName;  
	
	@ManyToMany
	@JoinColumn(name="user_id")
	Collection<User>users=new HashSet<User>();
	
	
	
	/**
	 * @return the checkListId
	 */
	public int getCheckListId() {
		return checkListId;
	}
	/**
	 * @param checkListId the checkListId to set
	 */
	public void setCheckListId(int checkListId) {
		this.checkListId = checkListId;
	}
	/**
	 * @return the checkListName
	 */
	public String getCheckListName() {
		return checkListName;
	}
	/**
	 * @param checkListName the checkListName to set
	 */
	public void setCheckListName(String checkListName) {
		this.checkListName = checkListName;
	}
	/**
	 * @return the users
	 */
	public Collection<User> getUsers() {
		return users;
	}
	/**
	 * @param users the users to set
	 */
	public void setUsers(Collection<User> users) {
		this.users = users;
	}

}
