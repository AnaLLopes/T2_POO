import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.inicializarDados();

        //C1
        System.out.println("C1: inicio");
        List<Livro> resultado = biblioteca.buscarLivrosPorTitulo("senhor");
        for (Livro livro : resultado) {
            System.out.println(livro);
        }
        System.out.println("C1: fim");

        //C2
        System.out.println("C2: inicio");
        String matriculaUsuario = "004"; 
        List<Livro> resultadoC2 = biblioteca.consultarLivrosEmprestadosParaUsuarioEspecifico(matriculaUsuario);
        for (Livro livro : resultadoC2) {
            System.out.println(livro);
        }
        System.out.println("C2: fim");

        //01
        System.out.println("O1: inicio");
        List<Livro> livrosOrdenadosPorAno = biblioteca.ordenarLivrosPorAnoDePublicacao();
        for (Livro livro : livrosOrdenadosPorAno) {
            System.out.println(livro);
        }
        System.out.println("O1: Fim");

        //02
        System.out.println("O2: inicio");
        List<Livro> livrosOrdenadosPorTitulo = biblioteca.ordenarLivrosPorTitulo();
        for (Livro livro : livrosOrdenadosPorTitulo) {
            System.out.println(livro);
        }
        System.out.println("O2: Fim");

        //03
        System.out.println("O3: inicio");
        List<Emprestimo> emprestimosOrdenadosPorData = biblioteca.ordenarEmprestimosPorDataDeDevolucao();
        for (Emprestimo emprestimo : emprestimosOrdenadosPorData) {
            System.out.println(emprestimo);
        }
        System.out.println("O3: Fim");

        //R1
        System.out.println("R1: inicio");
        List<Livro> relatorioLivrosMaisEmprestados = biblioteca.relatorioLivrosMaisEmprestados();
        for (Livro livro : relatorioLivrosMaisEmprestados) {
            System.out.println(livro);
        }
        System.out.println("R1: Fim");

        //R2
        System.out.println("R2: inicio");
        List<Usuario> relatorioUsuariosMaisPegamLivrosEmprestados = biblioteca.relatorioUsuariosQueMaisPegamLivrosEmprestados();
        for (Usuario usuario : relatorioUsuariosMaisPegamLivrosEmprestados) {
            System.out.println(usuario);
        }
        System.out.println("R2: Fim"); 
        
        //R3
        System.out.println("R3: inicio");
        List<Livro> relatorioLivrosNuncaEmprestados = biblioteca.relatorioLivrosNuncaEmprestados();
        for (Livro livro : relatorioLivrosNuncaEmprestados) {
            System.out.println(livro);
        }
        System.out.println("R3: Fim");

        //R4
        System.out.println("R4: inicio");
        double mediaGeralE = biblioteca.mediaGeralEmprestimosPorUsuario();
        System.out.println("A média geral de empréstimos é: " + mediaGeralE);
        System.out.println("R4: Fim");

        //R5
        System.out.println("R5: inicio");
        int N = 4; 
        List<Usuario> relatorioUsuariosComMaisDeNEmprestimos = biblioteca.relatorioUsuariosComMaisDeNEmprestimos(N);
        for (Usuario usuario : relatorioUsuariosComMaisDeNEmprestimos) {
            System.out.println(usuario);
        }
        System.out.println("R5: Fim");
    }
}
