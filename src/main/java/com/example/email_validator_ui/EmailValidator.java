package com.example.email_validator_ui;

public class EmailValidator {

	public int validate(String email){
		
		int count = 0;
		int t1 = 0, t2 =0;
		for(int i = 0; i < email.length(); i++){ //look through the email string
			
			if(email.charAt(i) == '@') //if there is @ in the string
				t1++;
			if(email.charAt(i) == '.') //if there is . in the string
				t2++;
		}
			
		if(t1 == 1) //if there is one single @ in the string
			count++;
		
		if(t2 >= 1) //if there is at least one . in the string
			count++;
/*
* own rules:
*/

		if(email.matches("^[^<>%$]*$")) //if there is not included special character
			count++;
		
		if(email.matches("^[^\\s]*$")) //if there is not included space
			count++;
		
		if(email.endsWith(".com") || email.endsWith(".ca")) //if there is end with .com or .ca
			count++;
		
		return count;
	}
}
