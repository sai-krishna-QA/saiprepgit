package Conditionalstatements;

public class Ifclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Even or Odd Checker
		System.out.println("Even or Odd Checker");

		int a = 10;

		if (a % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("Odd");

		}

		// Positive Number Validator
		System.out.println(" ");
		System.out.println("Positive Number Validator");

		int b = 20;

		if (b >= 0) {
			System.out.println("+ve");
		} else {
			System.out.println("-ve");
		}

		// vowels Number Validator
		System.out.println(" ");
		System.out.println("vowels ");

		char ch = 'e';

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("It is a vowel.");
		}

		// Age Eligibility Checker
		System.out.println(" ");
		System.out.println("Age Eligibility Checker");

		int age = 15;

		if (age >= 18) {
			System.out.println(" Eligible to vote ");
		} else {
			System.out.println("Not Eligible to vote ");
		}

		// Temperature Conversion Hint
		System.out.println(" ");
		System.out.println("Temperature Conversion Hint");

		int Temperature = -5;

		if (Temperature <= 0) {
			System.out.println("Freezing point");
		} else {
			System.out.println("Above Freezing point ");
		}

		// Pass/Fail Checker
		System.out.println(" ");
		System.out.println("Pass/Fail Checker");

		int marks = 40;

		if (marks >= 40) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		// Grade Calculator

		System.out.println(" ");
		System.out.println("Grade Calculator");

		int score = 60;

		if (score >= 90 && score <= 100) {
			System.out.println("Grade: A");
		} else if (score >= 80 && score < 90) {
			System.out.println("Grade: B");
		} else if (score >= 70 && score < 80) {
			System.out.println("Grade: C");
		} else if (score >= 60 && score < 70) {
			System.out.println("Grade: D");
		} else if (score >= 0 && score < 60) {
			System.out.println("Grade: F");
		} else {
			System.out.println("Invalid score entered!");
		}

//positive, negative, or zero

		System.out.println(" ");
		System.out.println("positive, negative, or zero");

		int number = 0;
		if (number >= 0) {
			System.out.println("+ve");
		} else if (number <= 0) {
			System.out.println("-ve");
		} else {
			System.out.println("zero");
		}
		
		//Simple Calculator

				System.out.println(" ");
				System.out.println("Simple Calculator");
		int i = 10;
		int j = 5;
		char operator = '+'; // Change to '-', '*', or '/'
	    if (operator == '+') {
	        System.out.println("Addition: " + (i + j));
	    } else if (operator == '-') {
	        System.out.println("Subtraction: " + (i - j));
	    } else if (operator == '*') {
	        System.out.println("Multiplication: " + (i * j));
	    } else if (operator == '/') {
	        if (j != 0) {
	            System.out.println("Division: " + (i / j));
	        } else {
	            System.out.println("Cannot divide by zero.");
	        }
	    } else {
	        System.out.println("Invalid operator.");
	    
	}

	}
}
