package week5day2;

import java.util.HashMap;
import java.util.Scanner;

public class Q2bookauthors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> books = new HashMap<String,String>();
		
		books.put("harrypotter","JKRowling");
		books.put("war&peace", "Tolstoy");
		books.put("mobydick", "HermanMelville");
		
		Scanner scaner= new Scanner(System.in);
		while(true) {
		System.out.println("enter the book name");
		String name = scaner.next();
		
		if(books.containsKey(name)) {
			System.out.println("authorname: "+ books.get(name));
		}
		
		}
	}
}
