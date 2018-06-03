import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
class phone 
{
	String name, time;
	String phnumber;
	phone(String na, String n, String t) 
	{
		name = na;
		phnumber = n;
		time = t;
	}
	public String toString() 
	{
		return "Name is:" + name + " Number: " + phnumber + " Time: " + time;
	}
}
