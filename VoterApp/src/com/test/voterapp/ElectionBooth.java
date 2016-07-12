/**
 * 
 */
package com.test.voterapp;

/**
 * @author proy3
 *
 */
public class ElectionBooth {

	public ElectionBooth() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("In Election booth");
	}
	String[] locations={"kolkata","kharagpur","bangalore","gurgaon"};
boolean checkAge(int age) throws UnderAgeException {
	if (age<18) {
		throw new UnderAgeException("Grow up to vote");
		
	}
		return true;
}
	
boolean checkVoterId(int voterid) throws NoVoterIdException {
	if (voterid>1000 || voterid<100 ) {
		throw new NoVoterIdException("Get a proper voterid");
		
	}else {
		return true;
	}
		
}

boolean checkLocation(String location) throws LocationMismatchException {
	for(String place:locations){
	if (location.equalsIgnoreCase(place)) {
		return true;
		 
	}
	}
		throw new LocationMismatchException("Not your booth");
	
}

public boolean checkVote(int age, int voterid, String location)throws UnderAgeException,NoVoterIdException,LocationMismatchException {
	checkAge(age);
	checkVoterId(voterid);
	checkLocation(location);
	return true;
}
}
