import java.util.Scanner;
public class Logische_Operatoren_II {
    public static void main(String[] args) {
        boolean schalter1, schalter2, heizungAn = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Ist Not-Aus-Schalter 1 betätigt? (true/false): ");
        schalter1 = input.nextBoolean();
        System.out.print("Ist Not-Aus-Schalter 2 betätigt? (true/false): ");
        schalter2 = input.nextBoolean();
        if (schalter1 || schalter2) {
            heizungAn = false;
        }
        System.out.println("Die Heizung ist eingeschaltet? " + heizungAn);
input.close();
    }

}
