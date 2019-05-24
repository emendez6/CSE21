package io;

import java.util.*;
import java.io.*;

public class PhoneNums {

	public ArrayList<String> readPhoneNumbers() {

		String filename = "data/phone.txt"; 
		ArrayList<String> output = new ArrayList<String>();

		try {
			Scanner input = new Scanner ( new FileReader(filename) );

			while (input.hasNextLine()) {
				input.useDelimiter("-");
				
				String cty = input.next();  //+1
				String area = input.next(); //area
				String phone = input.nextLine(); //rest of line
			
				cty = cty.replace("+", "");
				phone = phone.replace("-", "");
				System.out.println("Country Code: " + cty);
				System.out.println("Area Code: " + area);
				System.out.println("Phone Number: " + phone);
				
				/*	
				 *	Fill-in 
				 */
				//System.out.println(input.nextLine()); // Comment this line out 
			} 
			input.close();
		} catch ( NoSuchElementException e){
			System.out.println(e);

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		return output;
		
	}
	
	

}
