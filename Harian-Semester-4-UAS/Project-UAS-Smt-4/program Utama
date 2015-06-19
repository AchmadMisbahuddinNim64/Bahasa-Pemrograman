import java.util.*;
public class ProgramUtama 
{
	//Inisialisasi vector user
	public static Vector <String> username = new Vector <String>();
	public static Vector <String> password = new Vector <String>();
	public static Vector <String> status = new Vector <String>();
	public static Scanner sc = new Scanner (System.in);
	
	public static void main (String [] miku)
	{
		//Data awal
		username.add("admin");
		password.add("admin");
		status.add("admin");
		username.add("kasir");
		password.add("kasir");
		status.add("kasir");
			boolean ceklogin = false;
		
		do 
		{
			//Login
			System.out.println ("");
			System.out.println ("======= LOGIN =======");
			System.out.print ("Input Username \t: ");
			String user = sc.next();
			System.out.print ("Input Password \t: ");
			String pass = sc.next();
				if (username.contains(user) && password.contains(pass)) 
				{
					if (username.indexOf(user) == password.indexOf(pass))
					{
						int urutan = username.indexOf(user);
						String cek = status.elementAt(urutan);
						if (cek.equalsIgnoreCase("admin"))
						{
							System.out.println ("Selamat Datang "+user+", Anda Login sebagai ADMIN");
							AreaAdmin.admin ();
							ceklogin = true;
						}
							else if (cek.equalsIgnoreCase("kasir")) 
							{
								System.out.println ("Selamat Datang Kasir"+user+", Anda Login sebagai KASIR");
								AreaAdmin.kasir();
								ceklogin=true;
							}
						}
						else 
						{
							System.out.println ("Inputan salah, Login gagal"); 
						}
				}
					else 
					{
						System.out.println ("Inputan salah, Login gagal"); 
					}
		} while (ceklogin = true);
	}
	

}
