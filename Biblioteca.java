import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public void inicializarDados() {
        // Adicionando livros
        livros.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "1234567890", "disponível"));
        livros.add(new Livro("Duna", "Frank Herbert", 1965, "2345678901", "emprestado"));
        livros.add(new Livro("1984", "George Orwell", 1949, "3456789012", "disponível"));
        livros.add(new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967, "4567890123", "emprestado"));
        livros.add(new Livro("O Nome da Rosa", "Umberto Eco", 1980, "5678901234", "disponível"));
        livros.add(new Livro("Moby Dick", "Herman Melville", 1851, "6789012345", "disponível"));
        livros.add(new Livro("O Grande Gatsby", "F. Scott Fitzgerald", 1925, "7890123456", "emprestado"));
        livros.add(new Livro("Ensaio sobre a Cegueira", "José Saramago", 1995, "8901234567", "disponível"));
        livros.add(new Livro("A Revolução dos Bichos", "George Orwell", 1945, "9012345678", "disponível"));
        livros.add(new Livro("O Sol é para todos", "Harper Lee", 1960, "0123456789", "emprestado"));
        livros.add(new Livro("Crime e Castigo", "Fyodor Dostoevsky", 1866, "1122334455", "disponível"));
        livros.add(new Livro("Dom Quixote", "Miguel de Cervantes", 1605, "2233445566", "disponível"));
        livros.add(new Livro("O Alquimista", "Paulo Coelho", 1988, "3344556677", "emprestado"));
        livros.add(new Livro("Ilíada", "Homer", -800, "4455667788", "disponível"));
        livros.add(new Livro("Odisséia", "Homer", -750, "5566778899", "emprestado"));
        livros.add(new Livro("Orgulho e Preconceito", "Jane Austen", 1813, "6677889900", "disponível"));
        livros.add(new Livro("Ulisses", "James Joyce", 1922, "7788990011", "disponível"));
        livros.add(new Livro("A Metamorfose", "Franz Kafka", 1915, "8899001122", "emprestado"));
        livros.add(new Livro("Os Irmãos Karamazov", "Fyodor Dostoevsky", 1880, "9900112233", "disponível"));
        livros.add(new Livro("Madame Bovary", "Gustave Flaubert", 1856, "0011223344", "disponível"));

        // Adicionando usuários
        usuarios.add(new Usuario("João Silva", "001"));
        usuarios.add(new Usuario("Maria Pereira", "002"));
        usuarios.add(new Usuario("Pedro Alves", "003"));
        usuarios.add(new Usuario("Ana Souza", "004"));
        usuarios.add(new Usuario("Bruno Mendes", "005"));
        usuarios.add(new Usuario("Camila Freitas", "006"));
        usuarios.add(new Usuario("Diego Costa", "007"));
        usuarios.add(new Usuario("Eliane Ribeiro", "008"));
        usuarios.add(new Usuario("Fábio Nunes", "009"));
        usuarios.add(new Usuario("Gisele Fernandes", "010"));

        // Adicionando empréstimos
        emprestimos.add(new Emprestimo(livros.get(1), usuarios.get(0), "01/09/2023", "08/09/2023"));
        emprestimos.add(new Emprestimo(livros.get(1), usuarios.get(0), "02/09/2023", "09/09/2023"));
        emprestimos.add(new Emprestimo(livros.get(2), usuarios.get(0), "03/09/2023", "10/09/2023"));
        emprestimos.add(new Emprestimo(livros.get(3), usuarios.get(0), "04/09/2023", "11/09/2023"));
        emprestimos.add(new Emprestimo(livros.get(4), usuarios.get(0), "05/09/2023", "12/09/2023"));
        emprestimos.add(new Emprestimo(livros.get(5), usuarios.get(0), "06/09/2023", "13/09/2023"));
        emprestimos.add(new Emprestimo(livros.get(6), usuarios.get(0), "07/09/2023", "14/09/2023"));
        emprestimos.add(new Emprestimo(livros.get(7), usuarios.get(0), "08/09/2023", "15/09/2023"));
        emprestimos.add(new Emprestimo(livros.get(8), usuarios.get(0), "01/10/2023", "08/10/2023"));
        emprestimos.add(new Emprestimo(livros.get(9), usuarios.get(0), "02/10/2023", "09/10/2023"));
        emprestimos.add(new Emprestimo(livros.get(10), usuarios.get(1), "03/10/2023", "10/10/2023"));
        emprestimos.add(new Emprestimo(livros.get(11), usuarios.get(1), "04/10/2023", "11/10/2023"));
        emprestimos.add(new Emprestimo(livros.get(12), usuarios.get(2), "05/10/2023", "12/10/2023"));
        emprestimos.add(new Emprestimo(livros.get(13), usuarios.get(2), "06/10/2023", "13/10/2023"));
        emprestimos.add(new Emprestimo(livros.get(14), usuarios.get(3), "07/10/2023", "14/10/2023"));
        emprestimos.add(new Emprestimo(livros.get(15), usuarios.get(3), "08/10/2023", "15/10/2023"));
        emprestimos.add(new Emprestimo(livros.get(16), usuarios.get(4), "09/10/2023", "16/10/2023"));
        emprestimos.add(new Emprestimo(livros.get(17), usuarios.get(4), "10/10/2023", "17/10/2023"));        
        emprestimos.add(new Emprestimo(livros.get(18), usuarios.get(5), "11/10/2023", "18/10/2023"));
        emprestimos.add(new Emprestimo(livros.get(19), usuarios.get(6), "12/10/2023", "19/10/2023"));
    }

    private int getNumeroEmprestimosPorUsuario(String matricula) {
        return (int) emprestimos.stream()
                .filter(e -> e.getUsuario().getMatricula().equals(matricula))
                .count();
    }

    // C1: Método que implementa uma busca por título
    public List<Livro> buscarLivrosPorTitulo(String titulo) {
        return livros.stream()
                    .filter(l -> l.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
                    .collect(Collectors.toList());
    }

    // C2: Método que implementa a consulta de livros emprestados para um usuário específico
    public List<Livro> consultarLivrosEmprestadosParaUsuarioEspecifico(String matricula) {
        return emprestimos.stream()
        .filter(e -> e.getUsuario().getMatricula().equals(matricula))
        .map(Emprestimo::getLivro)
        .collect(Collectors.toList());
    }

    // O1: Ordenar os livros por ano de publicação utilizando a interface Comparable
    public List<Livro> ordenarLivrosPorAnoDePublicacao() {
        return livros.stream()
                .sorted((l1, l2) -> Integer.compare(l1.getAnoPublicacao(), l2.getAnoPublicacao()))
                .collect(Collectors.toList());
    }

    // O2: Ordenar os livros por título utilizando a interface Comparator
    public List<Livro> ordenarLivrosPorTitulo() {
        return livros.stream()
                .sorted(Comparator.comparing(Livro::getTitulo))
                .collect(Collectors.toList());
    }

    // O3: Ordenar empréstimos por data de devolução (mais recente primeiro)
    public List<Emprestimo> ordenarEmprestimosPorDataDeDevolucao() {
        return emprestimos.stream()
                .sorted((e1, e2) -> e2.getDataDevolucao().compareTo(e1.getDataDevolucao()))
                .collect(Collectors.toList());
    }

    // R1: Relatório de Livros Mais EmprestadoS
    public List<Livro> relatorioLivrosMaisEmprestados() {
        Map<Livro, Long> livroEmprestimoCount = emprestimos.stream()
                .collect(Collectors.groupingBy(Emprestimo::getLivro, Collectors.counting()));

        return livroEmprestimoCount.entrySet().stream()
                .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    // R2: Relatório de Usuários que Mais Pegam Livros Emprestados
    public List<Usuario> relatorioUsuariosQueMaisPegamLivrosEmprestados() {
        Map<Usuario, Long> usuarioEmprestimoCount = emprestimos.stream()
                .collect(Collectors.groupingBy(Emprestimo::getUsuario, Collectors.counting()));

        return usuarioEmprestimoCount.entrySet().stream()
                .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    // R3: Relatórios de Livros que Nunca Foram Emprestados
    public List<Livro> relatorioLivrosNuncaEmprestados() {
        List<Livro> livrosEmprestados = emprestimos.stream()
                .map(Emprestimo::getLivro)
                .collect(Collectors.toList());

        return livros.stream()
                .filter(l -> !livrosEmprestados.contains(l))
                .collect(Collectors.toList());
    }
    // R4: Média Geral de Empréstimos por Usuário
    public double mediaGeralEmprestimosPorUsuario() {
        if (usuarios.isEmpty()) {
            return 0.0;
        }
        int totalEmprestimos = emprestimos.size();
        return (double) totalEmprestimos / usuarios.size();
    }

    // R5: Relatório de Usuários com Mais de N Empréstimos
    public List<Usuario> relatorioUsuariosComMaisDeNEmprestimos(int N) {
        return usuarios.stream()
                .filter(u -> getNumeroEmprestimosPorUsuario(u.getMatricula()) > N)
                .collect(Collectors.toList());
    }

}