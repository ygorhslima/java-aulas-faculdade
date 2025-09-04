import java.util.Scanner;

public class Livro{
    //atributos
    String titulo;
    String autor;
    String categoria;
    int quant_paginas;
    int isbn;
    double preco;

    public Livro(){
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite o nome do livro: ");
        this.titulo = teclado.nextLine();

        System.out.printf("Informe a categoria: ");
        this.categoria = teclado.nextLine();

        System.out.printf("Informe o autor do livro: ");
        this.autor = teclado.nextLine();

        System.out.printf("Informe a quantidade de página:  ");
        this.quant_paginas = teclado.nextInt();
        teclado.nextLine();

        System.out.printf("Informe o preço do livro: ");
        this.preco = teclado.nextDouble();

        System.out.printf("Informe o código: ");
        this.isbn = teclado.nextInt();
    }

    public void abrirLivro(){
        System.out.println("Livro aberto");
    }
    public void fecharlivro(){
        System.out.println("Livro fechado");
    }
    
    public void lerLivro(){
        System.out.println("lendo livro");
    }

    public void venderLivro(){
        System.out.println("Vendendo livro");
    }

    public void mostrarDados(){
        System.out.println("-------------------------------------------------");
        System.out.println("titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("categoria: " + this.categoria);
        System.out.println("quant_páginas: " + this.quant_paginas);
        System.out.println("Código: " + this.isbn);
        System.out.println("-------------------------------------------------");
    }

}