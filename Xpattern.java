/*program to printing"X" pattern*/

package session4;// here I have created a package as session4
public class Xpattern{
	//declares a class called Xpattern
	//classes are the basics of opps(object oriented programming)
	public static void main (String[]args)
	//TODO Auto-generated method stub
	//Here public is a access modifier which defines who can access this method
	//Here static a keyword which identifies class related thing
	//void is used to define return type of the method,void means method wont return any value
	//main is name of method
	//declares method String[]
	//String[]args means arguments will be passed into main method and says that main() as a parameter
	{
		int x=5;  //here value x is initialized             
		char[] chars = new char[x];//assigning
		for  (int i = 0; i < x; i++) //here we taking an integer value where to execute five lines
			//*we are using char data type to assign the values 
			/*and we are using for loop here if the condition is true
			 * it increments the i value and prints the char value
			 */                  
		{
		 chars[i] = '*';//assigning the value
		 chars[x - 1 - i] = '*'; //char a primitive data type and hold a single character
		 
		 
		 for (int j = 0; j < x; j++) //this for loop is to initialize the number of columns 
			 //here j eqauls to zero,j less than x,j increment
		  {
		    if (j == i || j == (x - 1 - i)) //it comes to if statement and it executes the or condition
		    	
		      {
		        continue;// if the statement is true it continues it will the value of x exceeds 
		      }
		  chars[j] = ' ';//j value initialize as an empty space
		  }
		System.out.println(new String(chars));
		//success
		//system is used to return code
		//out is a static number
		//Println is used to print text and gives output
		//hence it prints the char values
		}
		
		
		
			
			}
		}




