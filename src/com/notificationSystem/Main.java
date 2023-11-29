package com.notificationSystem;

public class Main {
	public static void main(String ...args) {
		Notification pushNotification = new PushNotification() ;

		Notification emailNotification = new EmailNotification() ;

		Notification inAppNotification = new InAppMessageNotification() ;
		
		User user1 = new User("User1") ;
		user1.setNotificationType(pushNotification);

		user1.setNotificationType(emailNotification);
		
		User user2 = new User("User2") ;
		user2.setNotificationType(pushNotification);

		user2.setNotificationType(emailNotification);
		
		NotificationService notificationService = new NotificationService() ;
		notificationService.subscribe(user1);

		notificationService.subscribe(user2);
		
		notificationService.sendNotifications();

		
}
}
