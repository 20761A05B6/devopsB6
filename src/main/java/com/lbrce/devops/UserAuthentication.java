package com.lbrce.devops;

import java.util.ResourceBundle;

public class UserAuthentication {
	public boolean check(String inUID,String inPSW)
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String UID=rb.getString("uname");
		String PSW=rb.getString("pwd");
		if(inUID.equals(UID)&&inPSW.equals(PSW))
			return true;
		else
			return false;
	}

}