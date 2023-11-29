package com.notificationSystem;

public class NotificationFactory {
	
	public Notification createNotification(String str) {
		
		switch(str) {
		
		case "push" :
			return new PushNotification() ;
		
		case "email" :
			return new EmailNotification() ;
			
		case "inApp" :
			return new InAppMessageNotification() ;
		
			default :
				throw new IllegalArgumentException("Invalid Notification Type") ;
		}
		
		
	}
	

}
