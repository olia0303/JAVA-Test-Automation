package core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {

	public static void main(String[] args) {
		System.out.println(task("hjkl"));
		System.out.println(task2("ro3"));

	}
	public static boolean task(String taskString) {
		 Pattern p = Pattern.compile("[a-zA-Z]{0,4}");	 
		 Matcher m = p.matcher(taskString);
		 return m.matches();
	 }
	 
	 public static boolean task2(String taskString) {
		 Pattern p = Pattern.compile(".{4}");	 
		 Matcher m = p.matcher(taskString);
		 return m.matches();
	 
	 } 

}
