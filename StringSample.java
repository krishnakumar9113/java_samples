package com.sample.DS;

public class StringSample {

		  
	    public static void main(String[] args) {
	     //   String s1 = "Rachel";
	     //   String s2 = "Rachel";
	        String s3 = new String("Rachel");// outside string pool
	        String s4 = new String("Rachel").intern();
	  
	      //  System.out.println(s1 == s2); // true
	      //  System.out.println(s1 == s3); // false
	     //   System.out.println(s1 == s4); // true
	        System.out.println(s3 == s4);
	    }
	//conclusion:s1,s2,s4(new with intern option): same memory
}
