import java.util.*;
public class ProgTiketPesawat {
 public static void main (String[]args){
  Scanner sc = new Scanner(System.in);
  String kolom="";
  int total=0;
  String opsi="";
  int[][]kursi={{0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},};
  do{
  System.out.println("================================================");
  System.out.println("    Penjualan Tiket     ");
  System.out.println("================================================");
  System.out.println("1. Pesan Tiket ");
  System.out.println("2. Pembayaran ");
  System.out.println("3. Lihat Kursi ");
  System.out.println("4. Keluar ");
  System.out.println("================================================");
  System.out.print("Masukkan Pilihan : ");
  int pilih = sc.nextInt();
  
   switch (pilih) {
   
    case 1 :
        String jawaban="";
        do{
        System.out.println("----Pemesanan Tiket-----");
                double harga=0;
                double bayar=0;
                double kembalian=0;
                int batasawal=0;
                int batasakhir=0;
                System.out.println("Pilih Kelas tiket");
                System.out.println("1.VIP\n2.Eksekutif\n3.Bisnis\n4.Ekonomi");
                System.out.print("Masukan Pilihan [1-4] : ");
  int jawab=sc.nextInt();
                if (jawab==1){
                    batasawal=0;
                    batasakhir=1;
                    harga=0.75*100000+100000;
                }else if (jawab==2){
                    batasawal=2;
                    batasakhir=4;
                    harga=0.5*100000+100000;
                }else if (jawab==3){
                    batasawal=5;
                    batasakhir=9;
                    harga=0.3*100000+100000;
                }else if (jawab==4){
                    batasawal=10;
                    batasakhir=14;
                    harga=100000;
                }
                
              int kursikosong=0;
              int jumlah=0;
               for(int i=batasawal;i<batasakhir+1;i++)
  {
   for(int j=0;j<kursi[i].length;j++)
   {
    if(kursi[i][j]==0)
    {
    kursikosong++;
    }
   }
  }
                
                System.out.println("\nJumlah kursi tersedia : "+kursikosong);
                do{
                System.out.print("Jumlah tiket yang dipesan : ");
                jumlah=sc.nextInt();
                
                if (jumlah<=kursikosong)
                {
                int a=0;
                for(int i=batasawal;i<batasakhir+1;i++)
  {
   for(int j=0;j<kursi[i].length;j++)
   {
    if(kursi[i][j]==0)
    {
     if (j==0){
      kolom="A";
     }else if (j==1){
      kolom="B";
     }else if (j==2){
      kolom="C";
     }else if (j==3){
      kolom="D";
     }else if (j==4){
      kolom="E";
     }else if (j==5){
      kolom="F";
     }
     if (a<jumlah){
     System.out.print("Kursi yang dipesan :"+(i+1)+kolom+"\n");
     kursi[i][j]=1;
     a++;
     }
    }
  }
  }
                bayar=harga*jumlah;
                System.out.println("Sub total : "+bayar);
                total+=bayar;
                System.out.print("Pesan lagi? : [Y/N] ");
                jawaban=sc.next();
                }else{
                    System.out.println("Jumlah kursi tersedia tidak mencukupi");
                }
                }while(jumlah>kursikosong);
   }while(jawaban.equalsIgnoreCase("y"));
    break;
     
    case 2:
        int tunai=0;
        System.out.println("\n\t-----------DATA TRANSAKSI-------------");
        System.out.println("Total bayar : "+total);
        do{
        System.out.println("Tunai : ");
        tunai=sc.nextInt();
        if (tunai<total){
            System.out.println("Pembayaran kurang");
        }else{
            System.out.println("Kembalian : "+(tunai-total));
            total=0;
        }
        }while(tunai<total);
        System.out.println("Transaksi selesai");
        break;
        
    case 3 :
        System.out.println("\n\t-----------DATA KURSI-------------");
        System.out.println("VIP : Baris 1-2");
        System.out.println("Eksekutif : Baris 3-5");
        System.out.println("Bisnis : Baris 6-10");
        System.out.println("Ekonomi : Baris 10-15");
        System.out.println("=========================================================");
  System.out.println("Baris/Kolom\t A\t B\t C\t D\t E\t F");
  System.out.println("=========================================================");
  for(int i=0;i<kursi.length;i++)
  { 
   System.out.print(i+1+"\t\t|");
   for(int j=0;j<kursi[i].length;j++)
   {
    System.out.print(kursi[i][j]+"\t");
   }
   System.out.println("\n");
                }
    break;
    
     case 4:
       System.exit(0);
       break;
       default: break;
   }
  }while(true);
  
   }
 }