import java.util.Scanner;

public class Tecnica5 {
    public static String inverterString(String s) {
        StringBuilder sInvertida = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sInvertida.append(s.charAt(i));
        }
        return sInvertida.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String entrada = sc.nextLine();
        
        System.out.println("String invertida: " + inverterString(entrada));
    }
}