# reversenum1
import java.io.*;
import java.util.*;
import java.lang.*;
public class Reversenum1
{  
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=0;
    while(n!=0)
    {
      a=a*10;
      a=a+n%10;
      n=n/10;
      }
      System.out.println(""+a);
      }
      }
