package com.mik;

public class Test {
	public static void main(String[] args)
	{
		System.out.println("Arman vai");
		String  s = "arman,iit,bogura";
		
		String[] words = s.split(",");
		
		for(String word : words)
		{
			System.out.println(word);
		}
	}

}
