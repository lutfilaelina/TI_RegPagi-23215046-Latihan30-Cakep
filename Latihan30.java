/*
 * @author
 * NAMA     : Lutfi Laeli Nur Afiyah
 * KELAS    : Teknik Informatika 
 * NIM      : 23215046
 * Deskripsi Program : Menentukan apakah latihan dikerjakan sendiri atau tidak
 */

package Pertemuan6;
import static Pertemuan6.Latihan29.RED_TEXT;
import java.util.Scanner;

public class Latihan30 {
    
    public static final String RESET = "\033[0m"; 
    public static final String WHITE_TEXT = "\033[37m";
    public static final String RED_TEXT = "\033[31m"; 
    public static final String GREEN_TEXT = "\033[32m";
    public static final String YELLOW_TEXT = "\033[33m";
    public static final String BLUE_TEXT = "\033[34m";    
    public static final String PURPLE_TEXT = "\033[35m";
    public static final String CYAN_TEXT = "\033[36m";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(RED_TEXT + "Kamu " + GREEN_TEXT + "ngerjain sendiri " + YELLOW_TEXT + "latihan 17 sampe " + BLUE_TEXT + "latihan 30 ini?");
        System.out.print(BLUE_TEXT + "Jawab " + RED_TEXT + "(Yoi/Enggak) : " + RESET);
        
        String jawaban = scanner.nextLine().toUpperCase(); 

        if (jawaban.equals("YOI")) {
            System.out.println("\n" + RED_TEXT +"Cakep Bener." + PURPLE_TEXT +"Good Job" +RESET);
        } else if (jawaban.equals("ENGGAK")) {
            System.out.println(RED_TEXT +"Tetep cakep sih."+RESET);
            System.out.println(CYAN_TEXT +"Sing penting paham konsep nya yee."+RESET);
            System.out.println("Keep the code works dude");
        } else { 
            System.out.println("Jawaban tidak valid. Silakan jawab dengan 'Yoi' atau 'Enggak'.");
        }
        
        scanner.close();
    }
}
