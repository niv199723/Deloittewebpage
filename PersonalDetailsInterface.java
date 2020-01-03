package com.deloitte.designation.personalservices;

import java.util.ArrayList;

import com.deloitte.designation.model.PersonalDetails;



public interface PersonalDetailsInterface {
	public void addPerDetails(String userid, String emailid,String name, String fathername,String mothername,String address,String contactno, String gender,String password);
	public ArrayList<PersonalDetails> displayPerDet();
	public void loginDet(String userId,String password1);
}
