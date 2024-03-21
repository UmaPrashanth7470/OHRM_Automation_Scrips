package com.TestNG;

public class VerifingApplicaton extends Validating_application {
	
	public void verify() {
		 VerifingApplicaton va=new  VerifingApplicaton();
		 va.Applicatio_launching();
		 va.composemail();
		 va.draft();
		 va.sentbox();
		 va.inbox()	;
		 va.applicationclose();
		
	}

}
