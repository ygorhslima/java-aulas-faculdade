import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estante e;
        int tamanho;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual é o tamanho da estante: ");
        tamanho = teclado.nextInt();
        
        e = new Estante(tamanho);
       
        for(int i = 0; i < tamanho; i++){
            Livro livro = new Livro();
            e.livros[i] = livro;
        }

        e.mostrarLivros();


    }
}
