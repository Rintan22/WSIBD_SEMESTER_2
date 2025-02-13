
package tugas_acara7dan8;
import java.util.Scanner;
public class no2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nama;
        
        int pilih;
        
        
        System.out.println("          CAFE CERIA          ");
        System.out.println("         ANEKA MINUMAN        ");
        System.out.println("==============================");
        System.out.println("         SPECIAL MENU :       ");
        System.out.println("         1. Soft drinks       ");
        System.out.println("         2. Mix juice         ");
        System.out.println("         3. Nescafe           ");
        System.out.println("         4. Soda milk         ");
        System.out.println("         5. Tea               ");
        System.out.println("==============================");
        System.out.print("Masukkan nama pembeli : ");
        nama = scan.nextLine();
        System.out.print("\nSilahkan masukkan pilihan anda : ");
        pilih = scan.nextInt();
        
        String pesanan = null;
        switch(pilih){
            case 1 :
                pesanan = "Soft drinkS";
                break;
            case 2 : 
                pesanan = "Mix juice";
                break;
            case 3 :
                pesanan = "Nescafe";
                break;
            case 4 :
                pesanan = "Soda milk";
                break;
            case 5 :
                pesanan = "Tea";
                break;
                
        }
        
       
        System.out.println("Minuman yang anda pesan " +pesanan );
        System.out.println("Pesanan anda akan segera kami antar");
        System.out.println("Terima kasih " +nama+ " telah berkunjung di Cafe Ceria");
        
        
        
            
        
        
    
        
        
    }  
}
