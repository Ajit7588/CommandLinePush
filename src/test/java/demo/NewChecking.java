package demo;

import java.util.HashSet;
import java.util.Set;

public class NewChecking 
{
	public static void main(String[] args) {
		
		String x="ajit kumar tung";
		char[] a=x.toCharArray();
		Set<Character> set=new HashSet<>();
		for(Character i:a)
		{
			set.add(i);
		}
		
		System.out.println(set);
	}

}
