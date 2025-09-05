public class Estante {
    Livro[] livros;

    public Estante(int tamanho){
        this.livros = new Livro[tamanho];
    }
    public void mostrarLivros(){
        for (int i = 0; i < this.livros.length; i++){
            System.out.println(livros[i].mostrarDadosLivro());
        }
    }
}
