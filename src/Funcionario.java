public class Funcionario extends Pessoa implements TesteInterface {

public void comer() {
    System.out.println("Interface comer");
}

public void dormir() {
    System.out.println("Interface dormir");
}

public void acordar() {
    System.out.println("Interface acordar");
}

  public Funcionario(String nome, int idade, String cpf) {
      super(nome, idade, cpf);
  }


  public void testaConta() {
      System.out.println("Nome: "+this.nome);
      System.out.println("Idade: "+this.idade);
      System.out.println("CPF "+this.cpf);
  }


}
