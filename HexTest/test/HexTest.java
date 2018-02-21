
/*public class HexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/


package test;
import java.util.*;

public class HexTest  
{
String hex;
long res;

HexTest()
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


HexTest addHex(String h)
{
HexTest temp = new HexTest();
long number1 = coverToBase10(getHex());
long number2 = coverToBase10(h);
temp.res = number2 + number1;
temp.hex = Long.toHexString(number2 + number1);
return temp;
}

HexTest add(HexTest s)
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
HexTest h1 = new HexTest();
HexTest h2 = new HexTest();
HexTest result = new HexTest();

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

	char ch;
	do {
		
		
		System.out.print("\nAddition Result: ");
		result.showResult();
		
		 System.out.println("Do you want to try again? (Yes=y,No=n)");
         ch=input.next().charAt(0);
         System.out.println("Enter your first Number:");
         h1.hex = input.nextLine();
         System.out.println("Enter your second Number:");
         h2.hex = input.nextLine();
         result = h1.add(h2);
         String temp1 = result.getHex();
         
         if (temp1.length()>10) 
         {
         System.out.println("Addition Flow");
         }
         else 
        	 System.out.print("\nAddition Result: ");
 		result.showResult();
	
	}while(temp.length()>10 && (ch=='y'||ch=='Y'));
}
}
}
