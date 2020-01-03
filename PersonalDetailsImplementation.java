package com.deloitte.designation.personalservices;

import java.util.ArrayList;

import com.deloitte.designation.dao.PersonalDAO;
import com.deloitte.designation.model.PersonalDetails;


public class PersonalDetailsImplementation implements PersonalDetailsInterface{
		PersonalDetails pd = new PersonalDetails();	
	@Override
	public void addPerDetails(String userid, String emailid, String name, String fathername, String mothername,
			String address, String contactno, String gender, String password) {
		// TODO Auto-generated method stub
		pd.setUserid(Integer.parseInt(userid));
		pd.setEmailid(emailid);
		pd.setName(name);
		pd.setFathername(fathername);
		pd.setMothername(mothername);
		pd.setAddress(address);
		pd.setContactno(Long.parseLong(contactno));
		pd.setGender(gender);
		pd.setPassword(password);
		PersonalDAO.addPerDetails(pd);
	}
	@Override
	public ArrayList<PersonalDetails> displayPerDet() {
		// TODO Auto-generated method stub
		return PersonalDAO.displayPerDet();
	}
	@Override
	public void loginDet(String userId,String password1) {
		// TODO Auto-generated method stub
		PersonalDAO.loginDet(userId,password1);
	}

}
