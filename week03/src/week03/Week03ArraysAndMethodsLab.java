package week03;

import java.lang.reflect.Array;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
		String lb = "--------------------------------------------------------------------";
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] inRay = {1, 5, 2, 8, 13, 6,};
		
		// 2. Print out the first element in the array
		System.out.println(inRay[0]);
		System.out.println(lb);
		// 3. Print out the last element in the array without using the number 5
		System.out.println(inRay[inRay.length -1]);
		System.out.println(lb);
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println(inRay[6]); there is an error
		
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println(inRay[-1]); there is an error
			
		// 6. Write a traditional for loop that prints out each element in the array
		for (int i = 0; i < inRay.length; i++) {
			System.out.println(inRay[i]);
		}
			System.out.println(lb);
		// 7. Write an enhanced for loop that prints out each element in the array
			for (int number : inRay) {
				System.out.println(number);
			}
			System.out.println(lb);
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
			int sum = 0;
			for (int number : inRay) {
				System.out.println(sum += number);
			}
			
		// 9. Create a new variable called average and assign the average value of the array to it
			int avarage = sum / inRay.length;
			System.out.println(avarage);
			
			System.out.println(lb);
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
			for (int number : inRay) {
				if (number % 2 == 1) {
					System.out.println(number);
				}
			}
			System.out.println(lb);
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
			String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		
		// 12. Calculate the sum of all the letters in the new array
			int sumOfLetters = 0;
			
			for (String name : names) {
				sumOfLetters += name.length();
				System.out.println(sumOfLetters);
			}
		
			System.out.println(lb);
		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		greet("Gregory");
		greet("Robbie");
		System.out.println(lb);
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		System.out.println(greet2("Nick"));
		System.out.println(lb);
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		//		one changes the content, and one changes AND prints the content. both are useful for different things
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		System.out.println(isStringLongerThanNumber("Hello", 3));
		System.out.println(lb);
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		System.out.println(isStringSame(names, "hi"));
		System.out.println(lb);
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		System.out.println(getSmallestNumber(inRay));
		System.out.println(lb);
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double listArray[] = {19.23, 736.1290, 1.2, 89.5};
		
		System.out.println(getDoubleAvarage(listArray));
		
		System.out.println(lb);
		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		int[] nameLengths = extractStringLengths(names);
		for (int number : nameLengths) {
			System.out.println(number);
		}
		
		System.out.println(lb);
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		System.out.println(isEvenOrOddHigher(names));
		
		System.out.println(lb);
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		System.out.println(isPalindrome("racecars"));
		System.out.println(lb);
	}
	

	
	// Method 13:
	public static void greet(String name) {
		System.out.println("Hello, " + name);
	}

	// Method 14:
	public static String greet2(String name) {
		return "HI, " + name + "!!!";
	}
	
	// Method 15:
	public static boolean isStringLongerThanNumber(String string, int number) {
		return string.length() > number;
	}
	
	// Method 16:
	public static boolean isStringSame(String[] stringArray, String userWord) {
		for (String str : stringArray) {
			if (str.equals(userWord)) {
				return true;
			}
		}
		return false;
	}
	
	
	// Method 17:
	public static int getSmallestNumber(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if (number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}
	
	// Method 18:
	public static double getDoubleAvarage(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;
	}
	
	// Method 19:
	public static int[] extractStringLengths(String[] strings) {
		int[] results = new int[strings.length];
			for (int i = 0; i < strings.length; i++) {
				results[i] = strings[i].length();			
		}
			return results;
	}
	
	
	// Method 20:
	public static boolean isEvenOrOddHigher(String[] array) {
		int evenLetters = 0;
		int oddLetters = 0;
		
		for(String string : array) {
			if (string.length() % 2 == 0) {
				evenLetters += string.length();
			} else {
				oddLetters += string.length();
			}
		}
		return evenLetters > oddLetters;
	}
	
	// Method 21:
	public static boolean isPalindrome(String string) {
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1))
				return false;
		}
		return true;
	}
}
