
package tugas_acara7dan8;
import java.util.Scanner;
public class no1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
    String nama;
    double harga;
    double totalHarga = 0;
    int jumlahBarang = 5;
    boolean hargaValid = true;
    
        System.out.println("===================================================");
        System.out.println("             Kharisma Agung Plaza <KAP>            ");
        System.out.println("              Promo Belanja Berhadiah              ");
        System.out.println("          Khusus Pembelian 5 Barang Pertama        ");
        System.out.println("          Dengan harga minimum Rp 10000,00         ");
        System.out.println("===================================================");
        System.out.print("Masukkan nama pembeli : ");
        nama = scan.nextLine();
        
         for(int i=1;i<=jumlahBarang;i++){
            System.out.print("Masukkan harga barang ke-" +i+ "   : Rp. ");
            harga = scan.nextDouble();
            
            if(harga < 10000 ){
                hargaValid = false;
            }
            totalHarga += harga;
        }
        System.out.println("Total harga pembelian atas nama " +nama+ " adalah Rp " +totalHarga);
        if(hargaValid ){
            System.out.println("\nSelamat....\nAnda mendapat hadiah 1 buah mug cantik");
        }else {
            
        }
        System.out.println("=================================================");
        System.out.println("                 Terima Kasih                    ");
        System.out.println("    Anda sudah belanja di Kharisma Agung Plaza   ");

        
    }
    
}
