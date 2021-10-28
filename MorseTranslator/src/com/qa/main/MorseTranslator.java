package com.qa.main;


import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {
	private Map<String, String> Morse_map;
	public MorseTranslator() { //Constructor for the class
		
		this.Morse_map = new HashMap<>();
		this.Morse_map.put(".-","a");
		this.Morse_map.put("-...","b");
		this.Morse_map.put("-.-.","c");
		this.Morse_map.put("-..","d");
		this.Morse_map.put(".","e");
		this.Morse_map.put("..-.","f");
		this.Morse_map.put("--.","g");
		this.Morse_map.put("....","h");
		this.Morse_map.put("..","i");
		this.Morse_map.put(".---","j");
		this.Morse_map.put("-.-","k");
		this.Morse_map.put(".-..","l");
		this.Morse_map.put("--","m");
		this.Morse_map.put("-.","n");
		this.Morse_map.put("---","o");
		this.Morse_map.put(".--.","p");
		this.Morse_map.put("--.-","q");
		this.Morse_map.put(".-.","r");
		this.Morse_map.put("...","s");
		this.Morse_map.put("-","t");
		this.Morse_map.put("..-","u");
		this.Morse_map.put("...-","v");
		this.Morse_map.put(".--","w");
		this.Morse_map.put("-..-","x");
		this.Morse_map.put("-.--","y");
		this.Morse_map.put("--..","z");
		this.Morse_map.put("/", " ");
		//Sets up my HashMap to contain key of morse to alpha character value.
	}
//	public String translate(String morse) {
//		System.out.println(morse.split("/").toString());
//		return "lal";
//	}
    public String translate(String input) {
    	String[] inputList = input.split(" ");
    	
    	
    	String transString = "";
		for (String i : inputList) {
    		
    	transString += this.Morse_map.get(i);
    	}
    	
    	return transString;
    }
}
