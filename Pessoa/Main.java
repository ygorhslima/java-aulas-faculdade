package Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("joão");
        p1.setIdade(20);
        p1.setSexo('M');
        p1.setNacionalidade("Brasil");
        p1.mostrarDados();
    }
}
