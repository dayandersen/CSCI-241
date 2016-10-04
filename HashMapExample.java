/*
  This is designed to get students started with Programming Assignment 1
*/

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

   
        HashMap<String, Integer> wordToIndex = new HashMap<String, Integer>();
        
        System.out.println("After creation, the whole hashmap is " + wordToIndex);

       

        wordToIndex.put("firstWord", 1); // associate "firstWord" with the number 
                                         // "firstword" is the key, 0 is the value
                                         
        System.out.println( "After first insert, the whole hashmap is " + wordToIndex);


        wordToIndex.put("CSCI241Fall2016", 42); // associate "CSCI241Fall2016" with the number 42
                                         
                                         
        wordToIndex.put("Assignment1Help", 100); // associate "Assignment1Help" with 100 
        

        System.out.println(wordToIndex.get("CSCI241Fall2016")); // get returns the value associated with key
                                                                // "CSCI241Fall2016", should return 42
                                                        

        System.out.println(wordToIndex.get("CSCI347"));          // get returns a null as "CSCI347" is not a key
        
        System.out.println(wordToIndex.containsKey("CSCI347"));  // containsKey returns false as "CSCI347" is not a key
        
        
        System.out.println(wordToIndex.containsKey("CSCI241Fall2016"));  // containsKey returns true as "CSCI241Fall2016" is a key

        
        wordToIndex.put("CSCI241Fall2016",wordToIndex.get("CSCI241Fall2016")+1);
           
        System.out.println("Before remove, the whole hashmap is " + wordToIndex);
        
        System.out.println(wordToIndex.remove("firstWord"));  // removes the mapping for the key if present
        
        System.out.println("After remove, the whole hashmap is " + wordToIndex);
        
       


    }

}
