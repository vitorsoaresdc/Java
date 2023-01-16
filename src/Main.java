import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario("vitor", 25, "123.678.546-56");

        Funcionario func2 = new Funcionario("Neia", 54, "123456");

        func2.testaConta();

        func2.comer();
        func2.dormir();

        System.out.println("--------------------Array--------------------");

        ArrayList<String> clientes = new ArrayList<>();
        clientes.add("Vitor");
        clientes.add("Dulce");
        clientes.add("neia");
        clientes.add("nina");

        System.out.println(clientes);

    }

}