import java.util.*;
public class ganjil{
  public static void main (String[]args){
   Scanner scn=new Scanner (System.in);
   System.out.println("jumlah bilangan ganjil   :");
   int n=scn.nextInt();
   int i=1;
   int bilGanjil=1;
   while(i<=n){
     System.out.println(bilGanjil);
     bilGanjil +=2;
     i++;
   }
  }
}