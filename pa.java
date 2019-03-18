import java.util.Stack;
import java.util.Scanner;
class Palindrome
{
public static void main(String[] args)
{
System.out.println("enter  the string:");
Scanner in=new Scanner(System.in);
String inputstring=in.nextLine();
Stack stack=new stack();
for(int i=0;i<inputString.length();i++)
{
stack.push(inputString.charAt(i));
}
String reverseString=" ";
while(!stack.isEmpty())
{
reverseString=reverseString+stack.pop();
}
if(inputString.equals(reverseSting))impo
System.out.println("stringis a palindrome");
else
System.out.println("string is not a palindrome");
}
}
