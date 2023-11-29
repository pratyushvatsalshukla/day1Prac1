package com.notificationSystem;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

	private List<User> subscribers = new ArrayList<>() ;
	
	public void subscribe(User user) {
		subscribers.add(user) ;
	}
	
	public void sendNotifications() {
		for(User user : subscribers){
			List<Notification> preferredNotification = user.getNotificationType() ;
			for(Notification notification : preferredNotification) {
				notification.send();
			}
		}
	}
	
	
	
}
