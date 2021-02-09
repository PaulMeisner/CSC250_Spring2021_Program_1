import java.util.Scanner;

//Write a Java program that defines a String variable and then creates a loop that goes through every character in the String and counts the number of vowels (a,e,i,o,u,A,E,I,O,U) it finds.  Display the vowel count to the screen.  

//Your string variable should hold the name of one of the Bible books in the new testament.

//For example, if the variable held “Matthew” your program should display 2 since there are 2 vowels in that String. 

//You can’t use the indexOf function (this is like find in Python), but you can’t use it for this assignment…so write a function that determines of a character is a vowel or not.

//Submit a screenshot of your code and the self assessment

public class Driver
{
	public static void main(String[] args)
	{
		//ask for string
		Scanner input = new Scanner(System.in);
		System.out.println("Insert sentence:");
		String str = input.nextLine();
		//verify that string was put in
		System.out.println(str);
		//print out the vocals by usng the created function
		int result = findVocal(str);
		System.out.println(result);
	
	}
	//create find vocal function
	//Vocal = vowels  in german

	static int findVocal(String s)
	{
		//verify if string was passed in
		System.out.println(s);
		//create int that stores vocals
		int count = 0;

		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			//set string to lower case
			c = Character.toLowerCase(c);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			{
			//store answer in count
			count ++;
	
			}
			
		}

		//return as long as not possible anymore
	
		return count;
	
		
	}

}
