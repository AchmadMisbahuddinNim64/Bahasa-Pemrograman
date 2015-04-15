import java.util.*;
public class percobaanLooping{
  public static void main (String[]args){
   Scanner scn=new Scanner (System.in);
   System.out.println("Masukkan Angka Awal Loop:");
   int awal=scn.nextInt();
   System.out.println("Masukkan Angka Akhir Loop:");
   int akhir=scn.nextInt();
   int c=awal;
   if(awal<akhir){
     while(c<=akhir){
       System.out.println(c);
       c++;
     }
   }
   System.out.println("Masukkan Angka Awal Loop:");
   awal=scn.nextInt();
   System.out.println("Masukkan Angka Akhir Loop:");
   akhir=scn.nextInt();
   c=awal;
    if(awal>akhir){
     while(c>=akhir){
       System.out.println(c);
       c--;
     }
   }
  }
}