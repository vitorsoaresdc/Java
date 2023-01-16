import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");

        String nome = entrada.nextLine();
        System.out.println(nome);

        entrada.close();
    }

}