public class Livro{
    //atributos
    String titulo;
    String autor;
    String categoria;
    int quant_paginas;
    int isbn;
    double preco;

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

}