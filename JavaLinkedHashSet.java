package JavaLinkedHashSet;

import java.util.LinkedHashSet;

public class JavaLinkedHashSet {

	public static void main(String[] args) {
	// created object from imported 'LinkedHashSet' class named 'myColours'
	// class set as string(txt) - LinkedHashSet<String>
		LinkedHashSet<String> myColours = new LinkedHashSet<String>();
		
	// object 'myColours' calls onto the '.add' function to put the name of colours into object created
		myColours.add("Red"); 
		myColours.add("Blue");
		myColours.add("Green");
		myColours.add("Yellow");
		myColours.add("Black");
		myColours.add("Blue"); // duplicate will be ignored
	
	// Display text
		System.out.println("My Colours are: ");
	
	// runs a for loop to input the colours in the object 'myColours' into the String variable 'colours'
		for(String colours: myColours) {
			System.out.println(colours); // Display the name of colours from String colours variable
		}
	

	}

}

// Result: (My Colours are: Red, Blue, Green, Yellow, Black)