import java.util.*;
public class soall_lima{
  public static void main (String []args){
    Scanner sc=new Scanner (System.in);
    System.out.println ("Masukan jumlah soal :");
    int soal=sc.nextInt();
    int i=1;
    int c=1;
    String output="";
    System.out.println ("Tugas Soal Penjumlahan!");
    System.out.println ("No. \tSoal \tJawaban"); 
   
    while(i<soal+1){
    int a=(int)(Math.random()*25);
    int b=(int)(Math.random()*25);
    int kunci=a+b;

    System.out.print (i+").\t"+a+"+"+b+"=");
    int jawab=sc.nextInt();
    output +="\n"+i+").\t"+jawab+"\t"+kunci+"\t"+((jawab==kunci)?"Benar" : "Salah");
   i++;
    }
    System.out.println ("Hasil kuis anda:");  
    System.out.println ("\nNo."+"\tJawaban"+"\tKunci"+"\tStatus");  
    System.out.println (output);
    System.out.println(" Belajar Lagi");
}
}