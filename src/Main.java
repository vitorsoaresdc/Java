import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario("vitor", 25, "123.678.546-56");

        Funcionario func2 = new Funcionario("Neia", 54, "123456");

        func2.testaConta();

        func2.comer();
        func2.dormir();

        System.out.println("--------------------ArrayList--------------------");

        ArrayList<String> clientes = new ArrayList<>();
        clientes.add("Vitor");
        clientes.add("Dulce");
        clientes.add("neia");
        clientes.add("nina");
        clientes.add("Kelly");
        clientes.add("xena");

        //foreach
        for (String nomes: clientes) {
            System.out.print(" "+nomes);
        }


        for(int i = 0; i <clientes.size() ; i++) {
            System.out.println(clientes.get(i));
        }



        System.out.println("\n--------------------Collections--------------------\n");

        ArrayList<String> animais = new ArrayList<>();
        animais.add("cachorro");
        animais.add("gato");
        animais.add("cavalo");
        animais.add("rato");
        animais.add("esquilo");

        System.out.println(animais);


        Collections.sort(animais);
        System.out.println(animais);


        ArrayList<Recepcionista> pessoas = new ArrayList<>();
       pessoas.add(new Recepcionista("vitor", 25, "984.887.555.33"));
       pessoas.add(new Recepcionista("Dudu", 44, "984.887.435.66"));
       pessoas.add(new Recepcionista("Dulce", 74, "567.887.222.55"));


       Collections.sort(pessoas);

       for(Recepcionista lista: pessoas){
           System.out.println(lista.getNome());
       }

    }
}