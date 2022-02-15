package com.sbm.stringcore;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaxOccurenceConcept {
	
	private static void printMaxOccurringChar(String str)
    {   
        HashMap<Character, Integer> hmap = new HashMap<>();
         
        char[] ch = str.replaceAll("\\s+", "").toCharArray();
         
        for (char c : ch) 
        {
            if (hmap.containsKey(c))
            {
                hmap.put(c, hmap.get(c)+1);
            }
            else
            {
                hmap.put(c, 1);
            }
        }
         
        Set<Entry<Character, Integer>> entrySet = hmap.entrySet();
         
        int mCount = 0;
         
        char mChar = 0;
         
        for (Entry<Character, Integer> entry : entrySet) 
        {
            if (entry.getValue() > mCount)
            {
                mCount = entry.getValue();
                 
                mChar = entry.getKey();
            }
        }
         
        System.out.println("Input String : "+str);
         
        System.out.println("Maximum Occurring char and its count :");
         
        System.out.println(mChar+" : "+mCount);
    }
     
    public static void main(String[] args) 
    {
        printMaxOccurringChar("Java Concept Of The Day");
         
        System.out.println("========================");
         
        printMaxOccurringChar("Java J2ee Android Hibernate JSP");
         
        System.out.println("========================");
         
        printMaxOccurringChar("abbcccddddeeeeeffffff");
         
        System.out.println("=========================");
         
        printMaxOccurringChar("122333444455555666666");
    }
}
	
	
	
	
	
	


