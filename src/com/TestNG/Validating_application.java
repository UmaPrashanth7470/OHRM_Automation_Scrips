package com.TestNG;

import org.junit.After;
import org.testng.annotations.Test;

public class Validating_application {
	@Test(priority=1,description="launching the application")
	public void Applicatio_launching() {
	
		System.out.println("gmail application");
		}	
	@Test(priority=4,description="sent the mails")
	public void sentbox() {
		System.out.println("send mails all stored in sent box");
	}
	@Test(priority=3,description=" get the mails")
	public void inbox() {
		System.out.println("recieved mails are stored in  Inbox");
	}
	
	@Test(priority=5,description="it is unsent mails")
	public void draft() {
		System.out.println("un sent mails are  stored in draft ");
	}
	
	@Test(priority=2, description="typing the message for sent")
	public void composemail() {
		System.out.println("composing the mail");
	}
	@After()
	public void applicationclose() {
		System.out.println("closing the application");
		
	}
}
