
package tugas_acara7dan8;
import java.util.Scanner;

public class PK_2 {

    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Inputkan nama warna: ");
        lampu = scan.nextLine();
        
        switch (lampu) {
            case "merah":
                System.out.println("Lampu merah, berhenti");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati");
                break;
            case "hijau":
                System.out.println("Lampu hujau, silahkan jalan!");
                break;
            default:
                System.out.println("Warna lampu salah!");
        }
        
    }
    
}
