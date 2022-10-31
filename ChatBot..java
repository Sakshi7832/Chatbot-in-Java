import java.util.*;
import java.io.*;
public class Chatbot
{

	public static void main(String args[]) 
	{
	  while(true)
	  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Ask me anything:- ");
	  String User = sc.nextLine();
	  
	  if(User.equals("Hi!") || User.equals("Hi") || User.equals("hi") || User.equals("Hello") || User.equals("hello"))
	  {
		  System.out.println("User Said: " + User);
		  System.out.println("Bot Said: " + " Hello");
	  }
	  
	  else if(User.equals("Who are you?") || User.equals("who are you?") || User.equals("Are you robot or human?") || User.equals("Are you male or female?"))
	  {
		  System.out.println("User Said: " + User);
		  System.out.println("Bot Said" + " I am bot");
	  }
	  
	  else if(User.equals("How are you?") || User.equals("how are you?"))
	  {
		  System.out.println("User Said: " + User);
		  System.out.println("Bot Said:" + " I am fine thank you for asking.");
	  }
	   
	  else if(User.equals("Wanna be freinds?") || User.equals("wanna be freinds?"))
	  {
		  System.out.println("User Said: " + User );
		  System.out.println("Bot Said: " + "We are already freinds");
	  }
	  
	  else if(User.equals("Tell me a joke?") || User.equals("Tell me any joke?"))
	  {
		  System.out.println("User Said: " + User);
		  System.out.println("Bot Said: " + "What’s the best thing about Switzerland?" + 
		  		"I don’t know, but the flag is a big plus.");
	  }
	  else if(User.equals("Table"))
	  {
		  System.out.println("User Said: " + User);
		  System.out.println("Enter any number = ");
		  int num = sc.nextInt();
		  for(int i=1;i<=10;i++)
		  {
			  System.out.println(num+" * "+i+" = "+i*num);
		  }
		  
	  }
	  
	  else if(User.equals("Adding two numbers") || User.equals("adding two numbers"))
	  {
		  System.out.println("User Said: " + User);
		  System.out.println("Fist Number = ");
		  int num1 = sc.nextInt();
		  System.out.println("Second Number = ");
		  int num2 = sc.nextInt();
		  System.out.println("Bot Said: " + "Adding of two numbers is " + (num1+num2));
	}
	  else if(User.equals("Open Notepad") || User.equals("open notepad"))
	  {
		  Runtime rs = Runtime.getRuntime();
		  try {
			  rs.exec("notepad");
		  }
		  catch(IOException e)
		  {
			  System.out.println(e);
		  }
		  }
	  else if(User.equals("Open Google"))
	  {
		  try {
			    Process p = Runtime.getRuntime().exec("\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\"");
			    p.waitFor();
			    System.out.println("Google Chrome launched!");
			}
		  catch (Exception e) {
			    e.printStackTrace();
			}
	  }

	  else if(User.equals("Exit") || User.equals("exit"))
	  {
		  System.exit(0);
	  }}}}
