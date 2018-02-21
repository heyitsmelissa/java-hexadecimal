package test;
import java.util.*;


/* Melissa Lava
 * CS 55
 * Project 5
 * In this assignemnt, we are to write a program to perform addition of two hexadecimal numerals each up to 10 digits.
 * If the result of the addition is more than 10 digits long, give the output
 * message “Addition Overflow” and not the result of addition. Use arrays to store
 * hexadecimal numerals as arrays of characters. Include a loop to repeat this calculation for
 * new numbers until the user she or he wants to end the program.
 */


public class Hex  
{
String hex;
long res;

Hex() 
{ 
hex = "";
res = 0;
}

String getHex() 
{
return hex;
}
void setHex(String h)
{
hex = h;
}


Hex addHex(String h)
{
Hex temp = new Hex();
long number1 = coverToBase10(getHex());
long number2 = coverToBase10(h);
temp.res = number2 + number1;
temp.hex = Long.toHexString(number2 + number1);
return temp;
}

Hex add(Hex s)
{
return addHex(s.hex);
}
void showResult()
{
System.out.println(Long.toHexString(res));
}

long coverToBase10(String str)
{
String strHexa = "0123456789ABCDEF";
      str = str.toUpperCase();
      long temp = 0;
      for(int a = 0; a < str.length(); a++)
      {
         char h = str.charAt(a);
         long d = strHexa.indexOf(h);
         temp = 16 * temp + d;
      }
      return temp;
}

public static void main(String[] args)
{
Hex h1 = new Hex();
Hex h2 = new Hex();
Hex result = new Hex();

Scanner input = new Scanner(System.in);   
System.out.println("Enter your first Number:");
h1.hex = input.nextLine();
System.out.println("Enter your second Number:");
h2.hex = input.nextLine();
result = h1.add(h2);
String temp = result.getHex();
if (temp.length()>10) 
{
System.out.println("Addition Flow");
}
else 
{
System.out.print("\nAddition Result: ");
result.showResult();
}
}
}
