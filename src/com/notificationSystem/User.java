package com.notificationSystem;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String userName ;
	
	private List<Notification> notificationType = new ArrayList<>() ;
	
	public User(String userName) {
		this.setUserName(userName);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public ArrayList<Notification> getNotificationType() {
		return (ArrayList<Notification>) notificationType;
	}

	public void setNotificationType(Notification notificationType) {
	//	notificationType.add(notificationType);
	}
}
