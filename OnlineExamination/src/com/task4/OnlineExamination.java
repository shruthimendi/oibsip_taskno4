package com.task4;
import java.util.*;

    public class OnlineExamination {
	
	static String username="admin";

	static String password="password";

	static Exam exam= new Exam(){};

	static Thread cdt=new Thread() {

		@Override

		public void run() {

	        for (int i=10; i>=0;i--) {

	        	try {

	        		Thread.sleep(2000);

	        	}catch(Exception e) {

	        		System.out.println("Error : "+ e);

	        	}

	        }

	        System.err.println("Time Finished your answers submitted automatically");

		}

	};

	public static void main(String[] args) {

		System.out.println("Please enter the username");

		Scanner scanner= new Scanner(System.in);

		String UN=scanner.nextLine();

	    if(UN.equals(username)) {

	    	System.out.println("Please enter the password");

			Scanner scanner1= new Scanner(System.in);

			String PW=scanner1.nextLine();

	    	if(PW.equals(password)) {

	    		System.out.println("login successfull\nGet ready to write the exam\n");

	    		//-------------------------------//

	    		cdt.start();

	    		

	    		//-------------------------------//

	    		exam.mcqs();

	    	}else {System.err.println("invalid credentials");}

	    }else {System.err.println("invalid credentials");}

	}

}



class Exam {

	public void mcqs() {

		System.out.println("what is the capital of India\nA. Delhi \nB. hyderabad \n select an option");

		Scanner ans1= new Scanner(System.in);

		String answer1= ans1.nextLine();

		

		System.out.println("what is the capital of telangana\nA. Peddapalli \nB. hyderabad\n select an option");

		Scanner ans2= new Scanner(System.in);

		String answer2= ans2.nextLine();



		System.out.println("what is the capital of Peddapalli\nA. godavarikhani \nB. Kamanpur\n select an option");

		Scanner ans3= new Scanner(System.in);

		String answer3= ans3.nextLine();
		
		System.out.println("Do you want to logout");
		Scanner Command1 = new Scanner(System.in);
		String Command = ans2.nextLine();
		if(Command.equals("yes")) {
			System.out.println("logout successful");
			
		}else {System.out.println("you will be atomatically logged out");



	}
		

}}
	