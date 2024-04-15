package service;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Controle {
    public void inserirUsuario(String nome, String cpf, String endereco, String telefone){
        String sql = "INSERT INTO USUARIO (NOME, CPF, ENDERECO, TELEFONE) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, cpf);
            stmt.setString(3, endereco);
            stmt.setString(4, telefone);
            stmt.execute();
            stmt.close();
            System.out.println("Usuário inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir usuário!");
            e.printStackTrace();
        }
    }

    public void inserirFuncionario(String nome, String cpf, String funcao, float salario){
        String sql = "INSERT INTO FUNCIONARIO (NOME, CPF, FUNCAO, SALARIO) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, cpf);
            stmt.setString(3, funcao);
            stmt.setFloat(4, salario);
            stmt.execute();
            stmt.close();
            System.out.println("Funcionário inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir funcionário!");
            e.printStackTrace();
        }
    }

    public void editarFuncionario(String cpf, String nome, String funcao, float salario){
        String sql = "UPDATE FUNCIONARIO SET NOME = ?, FUNCAO = ?, SALARIO = ? WHERE CPF = ?";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, funcao);
            stmt.setFloat(3, salario);
            stmt.setString(4, cpf);
            stmt.execute();
            stmt.close();
            System.out.println("Funcionário editado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao editar funcionário!");
            e.printStackTrace();
        }
    }


    public void editarUsuario(String nome, String cpf, String endereco, String telefone){
        String sql = "UPDATE USUARIO SET NOME = ?, ENDERECO = ?, TELEFONE = ? WHERE CPF = ?";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, endereco);
            stmt.setString(3, telefone);
            stmt.setString(4, cpf);
            stmt.execute();
            stmt.close();
            System.out.println("Usuário editado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao editar usuário!");
            e.printStackTrace();
        }
    }

    public void inserirLivros(int codigo, String titulo, int edicao, int anoPublicacao, int codigoEditora, String genero, int codigoAutor){
        String sql = "INSERT INTO LIVROS (CODIGO, TITULO, EDICAO, ANOPUBLICACAO, CODIGOEDITORA, GENERO, CODIGOAUTOR, STATUS) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setInt(1, codigo);
            stmt.setString(2, titulo);
            stmt.setInt(3, edicao);
            stmt.setInt(4, anoPublicacao);
            stmt.setInt(5, codigoEditora);
            stmt.setString(6, genero);
            stmt.setInt(7, codigoAutor);
            stmt.setString(8, "Disponível");
            stmt.execute();
            stmt.close();
            System.out.println("Livro inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir livro!");
            e.printStackTrace();
        }
    }


    public void editarLivro(int codigo, String titulo, int edicao, int anoPublicacao, int codigoEditora, String genero, int codigoAutor){
        String sql = "UPDATE LIVROS SET TITULO = ?, EDICAO = ?, ANOPUBLICACAO = ?, CODIGOEDITORA = ?, GENERO = ?, CODIGOAUTOR = ? WHERE CODIGO = ?";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setString(1, titulo);
            stmt.setInt(2, edicao);
            stmt.setInt(3, anoPublicacao);
            stmt.setInt(4, codigoEditora);
            stmt.setString(5, genero);
            stmt.setInt(6, codigoAutor);
            stmt.setInt(7, codigo);
            stmt.execute();
            stmt.close();
            System.out.println("Livro editado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao editar livro!");
            e.printStackTrace();
        }
    }

    public void inserirEditora(int codigo, String nome, String contato){
        String sql = "INSERT INTO EDITORA (CODIGO, NOME, CONTATO) VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setInt(1, codigo);
            stmt.setString(2, nome);
            stmt.setString(3, contato);
            stmt.execute();
            stmt.close();
            System.out.println("Editora inserida com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir editora!");
            e.printStackTrace();
        }
    }

    public void editarEditora(int codigo, String nome, String contato){
        String sql = "UPDATE EDITORA SET NOME = ?, CONTATO = ? WHERE CODIGO = ?";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, contato);
            stmt.setInt(3, codigo);
            stmt.execute();
            stmt.close();
            System.out.println("Editora editada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao editar editora!");
            e.printStackTrace();
        }
    }

    public void inserirAutor(int codigo, String nome, String nacionalidade){
        String sql = "INSERT INTO AUTORES (CODIGO, NOME, NACIONALIDADE) VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setInt(1, codigo);
            stmt.setString(2, nome);
            stmt.setString(3, nacionalidade);
            stmt.execute();
            stmt.close();
            System.out.println("Autor inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir autor!");
            e.printStackTrace();
            }
        }

    public void editarAutor(int codigo, String nome, String nacionalidade){
        String sql = "UPDATE AUTORES SET NOME = ?, NACIONALIDADE = ? WHERE CODIGO = ?";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, nacionalidade);
            stmt.setInt(3, codigo);
            stmt.execute();
            stmt.close();
            System.out.println("Autor editado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao editar autor!");
            e.printStackTrace();
        }
    }

    public void removerUsuario(String cpf){
        String sql = "DELETE FROM USUARIO WHERE CPF = ?";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.execute();
            stmt.close();
            System.out.println("Usuario removido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao remover usuario!");
            e.printStackTrace();
        }
    }

    public void removerFuncionario(String cpf){
        String sql = "DELETE FROM FUNCIONARIO WHERE CPF = ?";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.execute();
            stmt.close();
            System.out.println("Funcionário removido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao remover funcionário!");
            e.printStackTrace();
        }
    }

    public void removerLivro(int codigo){
        String sql = "DELETE FROM LIVROS WHERE CODIGO = ?";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setInt(1, codigo);
            stmt.execute();
            stmt.close();
            System.out.println("Livro removido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao remover livro!");
            e.printStackTrace();
        }
    }

    public void removerEditora(int codigo){
        String sql = "DELETE FROM EDITORA WHERE CODIGO = ?";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setInt(1, codigo);
            stmt.execute();
            stmt.close();
            System.out.println("Editora removida com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao remover editora!");
            e.printStackTrace();
        }
    }

    public void removerAutor(int codigo){
        String sql = "DELETE FROM AUTORES WHERE CODIGO = ?";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setInt(1, codigo);
            stmt.execute();
            stmt.close();
            System.out.println("Autor removido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao remover autor!");
            e.printStackTrace();
        }
    }

    public void listarUsuarios(){
        String sql = "SELECT * FROM USUARIO";
        try (Statement stmt = Conexao.getConnection().createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()) {
                String cpf = rs.getString("CPF");
                String nome = rs.getString("NOME");
                String endereco = rs.getString("ENDERECO");
                String telefone = rs.getString("TELEFONE");
                System.out.println("---------------------------");
                System.out.println("Nome: " + nome);
                System.out.println("CPF: " + cpf);
                System.out.println("Endereço: " + endereco);
                System.out.println("Telefone: " + telefone);
            }   
        } catch (SQLException e) {
            System.out.println("Erro ao listar usuários!");
            e.printStackTrace();
        }
    }

    public void listarFuncionarios(){
        String sql = "SELECT * FROM FUNCIONARIO";
        try (Statement stmt = Conexao.getConnection().createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()) {
                String cpf = rs.getString("CPF");
                String nome = rs.getString("NOME");
                String funcao = rs.getString("FUNCAO");
                float salario = rs.getFloat("SALARIO");
                System.out.println("---------------------------");
                System.out.println("Nome: " + nome);
                System.out.println("CPF: " + cpf);
                System.out.println("Função: " + funcao);
                System.out.println("Salário: " + salario);
            }   
        } catch (SQLException e) {
            System.out.println("Erro ao listar funcionários!");
            e.printStackTrace();
        }
    }

    public void listarLivros(){
        String sql = "SELECT * FROM LIVROS";
        try (Statement stmt = Conexao.getConnection().createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()) {
                int codigo = rs.getInt("CODIGO");
                String titulo = rs.getString("TITULO");
                int edicao = rs.getInt("EDICAO");
                int anoPublicacao = rs.getInt("ANOPUBLICACAO");
                int codigoEditora = rs.getInt("CODIGOEDITORA");
                String genero = rs.getString("GENERO");
                int codigoAutor = rs.getInt("CODIGOAUTOR");
                String status = rs.getString("STATUS");
                System.out.println("---------------------------");
                System.out.println("Código: " + codigo);
                System.out.println("Título: " + titulo);
                System.out.println("Edição: " + edicao);
                System.out.println("Ano de Publicação: " + anoPublicacao);
                System.out.println("Código da Editora: " + codigoEditora);
                System.out.println("Gênero: " + genero);
                System.out.println("Código do Autor: " + codigoAutor);
                System.out.println("Status: " + status);
            }   
        } catch (SQLException e) {
            System.out.println("Erro ao listar livros!");
            e.printStackTrace();
        }
    }

    public void listarEditoras(){
        String sql = "SELECT * FROM EDITORA";
        try (Statement stmt = Conexao.getConnection().createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()) {
                int codigo = rs.getInt("CODIGO");
                String nome = rs.getString("NOME");
                String contato = rs.getString("CONTATO");
                System.out.println("---------------------------");
                System.out.println("Código: " + codigo);
                System.out.println("Nome: " + nome);
                System.out.println("Contato: " + contato);
            }   
        } catch (SQLException e) {
            System.out.println("Erro ao listar editoras!");
            e.printStackTrace();
        }
    }


    public void listarAutores(){
        String sql = "SELECT * FROM AUTORES";
        try (Statement stmt = Conexao.getConnection().createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()) {
                int codigo = rs.getInt("CODIGO");
                String nome = rs.getString("NOME");
                String nacionalidade = rs.getString("NACIONALIDADE");
                System.out.println("---------------------------");
                System.out.println("Código: " + codigo);
                System.out.println("Nome: " + nome);
                System.out.println("Nacionalidade: " + nacionalidade);
            }   
        } catch (SQLException e) {
            System.out.println("Erro ao listar autores!");
            e.printStackTrace();
        }
    }

    public void emprestarUsuario(int codigo, String cpf){
        String sql = "SELECT STATUS FROM LIVROS WHERE CODIGO = ?";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            String status = rs.getString("STATUS");
            if (status.equals("Disponível")) {
                sql = "UPDATE LIVROS SET STATUS = 'Emprestado' WHERE CODIGO = ?";
                stmt = Conexao.getConnection().prepareStatement(sql);
                stmt.setInt(1, codigo);
                stmt.execute();
                stmt.close();
                sql = "INSERT INTO EMPRESTARUSUARIO (CODIGO, CPF) VALUES (?, ?)";
                stmt = Conexao.getConnection().prepareStatement(sql);
                stmt.setInt(1, codigo);
                stmt.setString(2, cpf);
                stmt.execute();
                stmt.close();
                System.out.println("Livro emprestado com sucesso!");
            } else {
                System.out.println("Livro indisponível para empréstimo!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao emprestar livro!");
            e.printStackTrace();
       }
    }

    public void emprestarFuncionario(int codigo, String cpf){
        String sql = "SELECT STATUS FROM LIVROS WHERE CODIGO = ?";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            String status = rs.getString("STATUS");
            if (status.equals("Disponível")) {
                sql = "UPDATE LIVROS SET STATUS = 'Emprestado' WHERE CODIGO = ?";
                stmt = Conexao.getConnection().prepareStatement(sql);
                stmt.setInt(1, codigo);
                stmt.execute();
                stmt.close();
                sql = "INSERT INTO EMPRESTARFUNCIONARIO (CODIGO, CPF) VALUES (?, ?)";
                stmt = Conexao.getConnection().prepareStatement(sql);
                stmt.setInt(1, codigo);
                stmt.setString(2, cpf);
                stmt.execute();
                stmt.close();
                System.out.println("Livro emprestado com sucesso!");
            } else {
                System.out.println("Livro indisponível para empréstimo!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao emprestar livro!");
            e.printStackTrace();
       }
    }

    public void devolverUsuario(int codigo){
        String sql = "UPDATE LIVROS SET STATUS = 'Disponível' WHERE CODIGO = ?";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setInt(1, codigo);
            stmt.execute();
            stmt.close();
            System.out.println("Livro devolvido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao devolver livro!");
            e.printStackTrace();
        }
    }

    public void devolverFuncionario(int codigo){
        String sql = "UPDATE LIVROS SET STATUS = 'Disponível' WHERE CODIGO = ?";
        try {
            PreparedStatement stmt = Conexao.getConnection().prepareStatement(sql);
            stmt.setInt(1, codigo);
            stmt.execute();
            stmt.close();
            System.out.println("Livro devolvido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao devolver livro!");
            e.printStackTrace();
        }
    }
}

