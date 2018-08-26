package ru.javacore;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App 
{
	
    	public static boolean test(String testString) {
    	Pattern p=Pattern.compile("[a-z]{0,4}");
    	Matcher m = p.matcher(testString);
    	return m.matches();
     }
    	public static boolean test1(String testString) {
        	Pattern p=Pattern.compile(".{4}");
        	Matcher m = p.matcher(testString);
        	return m.matches();
         }
    	
    	public static void main(String[] args) {
    	System.out.println(test("java"));
    	System.out.println(test("cucumber"));
    	System.out.println(test("cat"));
    	System.out.println(test1("z.?7"));
    	System.out.println(test1("cuc3um-ber"));
    	System.out.println(test1("a-5,"));
}
}