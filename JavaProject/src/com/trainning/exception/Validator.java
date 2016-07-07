package com.trainning.exception;

public class Validator {
	String[] names={"ram","tom","jon"};
	boolean checkName(String name)throws NNFException{
		boolean flag=false;
			for(String Username:names){
			if(name.equals(Username)){
				flag = true;
				throw new NNFException("name exists");
			}
			}return flag;
	}
	boolean checkPassword(String password)throws Tooshort,Toolong {
		if(password.length()<5)
		{
			throw new Tooshort("pass too short");
		}else if (password.length()>13){
			throw new Toolong("pass to long");
		}else{
			return true;
		}
	}
}

				
		
