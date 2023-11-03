import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.inicializarDados();

        // Teste os métodos da classe Biblioteca aqui...

        System.out.println("C1: inicio");
        List<Livro> resultado = biblioteca.buscarLivrosPorTitulo("senhor");
        for (Livro livro : resultado) {
            System.out.println(livro);
        }
        System.out.println("C1: fim");

        System.out.println("C2: inicio");
        // Código para testar a consulta C2
        
        System.out.println("C2: fim");

    }
}
