public class Recepcionista extends Pessoa implements Comparable<Recepcionista> {

    public Recepcionista(String nome, Integer idade, String cpf) {
        super(nome, idade,cpf);
    }

    public int compareTo(Recepcionista o) {
        return 0;
    }

    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public void acordar() {

    }


}
