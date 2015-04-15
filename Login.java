import java.io.*;
class Login{
 public static void main (String[]args) throws IOException{
  BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
  
  String user = "Harits";
  String password = "its";
  
  System.out.println("===================");
  System.out.println("        LOGIN      ");
  System.out.println("===================");
  
  System.out.print("Masukkan Username : ");
  user=br.readLine();
  System.out.print("Masukkan Password : ");
  password=br.readLine();
  if (user.equals("Harits") && password.equals("its")){
   System.out.println("===================");
   System.out.println("Login Berhasil");
  }else{
   System.out.println("===================");
   System.out.println("Login Gagal");
  }
 }
}