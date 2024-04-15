package app;
import java.util.Scanner;
import service.Controle;

public class App {
    private Scanner scanner;
    private Controle controle;

    public App(){
        scanner = new Scanner(System.in);
        controle = new Controle();
    }

    public static void main(String[] args) {
        App app = new App();
        app.menu();
    }

    public void menu(){
        System.out.println("\nSistema de Gerenciamento de Biblioteca");
        System.out.println("1 - Adicionar");
        System.out.println("2 - Editar");
        System.out.println("3 - Remover");
        System.out.println("4 - Listar");
        System.out.println("5 - Emprestar para Usuario");
        System.out.println("6 - Devolver de Usuario");
        System.out.println("7 - Emprestar para Funcionario");
        System.out.println("8 - Devolver de Funcionario");
        System.out.println("0 - Sair");
        int op = scanner.nextInt();
        scanner.nextLine();
        switch(op){
            case 1:
                menuAdd();
                break;
            case 2:
                menuEditar();
                break;
            case 3:
                menuRemover();
                break;
            case 4:
                menuListar();
                break;
            case 5:
                emprestarUsuario();
                menu();
                break;
            case 6:
                devolverUsuario();
                menu();
                break;
            case 7:
                emprestarFuncionario();
                menu();
                break;
            case 8:
                devolverFuncionario();
                menu();
                break;
            case 0:
                System.out.println("Sistema encerrado");
                break;
            default:
                System.out.println("Opção inválida!");
                menu();
                break;
        }
    }

    public void adicionarUsuario(){
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.println("Telefone: ");
        String telefone = scanner.nextLine();
        controle.inserirUsuario(nome, cpf, endereco, telefone);
    }

    public void adicionarFuncionario(){
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Função: ");
        String funcao = scanner.nextLine();
        System.out.println("Salário: ");
        float salario = scanner.nextFloat();
        scanner.nextLine();
        controle.inserirFuncionario(nome, cpf, funcao, salario);
    }

    public void editarFuncionario(){
        System.out.println("Digite o CPF do Funcionario: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite o nome: ");  
        String nome = scanner.nextLine();
        System.out.println("Digite a função: ");
        String funcao = scanner.nextLine();
        System.out.println("Digite o salário: ");
        float salario = scanner.nextFloat();
        scanner.nextLine();
        controle.editarFuncionario(cpf, nome, funcao, salario);
    }

    public void editarUsuario(){
        System.out.println("Digite o CPF do Funcionario: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite o nome: ");  
        String nome = scanner.nextLine();
        System.out.println("Digite o endereço: ");
        String endereco = scanner.nextLine();
        System.out.println("Digite o telefone: ");
        String telefone = scanner.nextLine();
        controle.editarUsuario(nome, cpf, endereco, telefone);
    }

    public void adicionarLivro(){
        System.out.println("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Título: ");
        String titulo = scanner.nextLine();
        System.out.println("Edição: ");
        int edicao = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ano de publicação: ");
        int anoPublicacao = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Código da editora: ");
        int codigoEditora = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Gênero: ");
        String genero = scanner.nextLine();
        System.out.println("Código do autor: ");
        int codigoAutor = scanner.nextInt();
        controle.inserirLivros(codigo, titulo, edicao, anoPublicacao, codigoEditora, genero, codigoAutor);
    }

    public void emprestarUsuario(){
        System.out.println("Digite o código do livro: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o CPF: ");
        String cpf = scanner.nextLine();
        controle.emprestarUsuario(codigo, cpf);
    }

    public void emprestarFuncionario(){
        System.out.println("Digite o código do livro: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o CPF: ");
        String cpf = scanner.nextLine();
        controle.emprestarFuncionario(codigo, cpf);
    }


    public void devolverUsuario(){
        System.out.println("Digite o código do livro: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        controle.devolverUsuario(codigo);
    }

    public void devolverFuncionario(){
        System.out.println("Digite o código do livro: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        controle.devolverFuncionario(codigo);
    }


    public void editarLivro(){
        System.out.println("Digite o código do livro: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o título: ");
        String titulo = scanner.nextLine();
        System.out.println("Digite a edição: ");
        int edicao = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o ano de publicação: ");
        int anoPublicacao = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o código da editora: ");
        int codigoEditora = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o gênero: ");
        String genero = scanner.nextLine();
        System.out.println("Digite o código do autor: ");
        int codigoAutor = scanner.nextInt();
        controle.inserirLivros(codigo, titulo, edicao, anoPublicacao, codigoEditora, genero, codigoAutor);
    }

    public void adicionarEditora(){
        System.out.println("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Contato: ");
        String contato = scanner.nextLine();
        controle.inserirEditora(codigo, nome, contato);
    }

    public void editarEditora(){
        System.out.println("Digite o código da editora: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o contato: ");
        String contato = scanner.nextLine();
        controle.editarEditora(codigo, nome, contato);
    }

    public void adicionarAutor(){
        System.out.println("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Nacionalidade: ");
        String nacionalidade = scanner.nextLine();
        controle.inserirAutor(codigo, nome, nacionalidade);
    }

    public void editarAutor(){
        System.out.println("Digite o código do autor: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a nacionalidade: ");
        String nacionalidade = scanner.nextLine();
        controle.editarAutor(codigo, nome, nacionalidade);
    }

    public void menuAdd(){
        System.out.println("1 - Adicionar Funcionário");
        System.out.println("2 - Adicionar Usuário");
        System.out.println("3 - Adicionar Livro");
        System.out.println("4 - Adicionar Editora");
        System.out.println("5 - Adicionar Autor");
        System.out.println("0 - Voltar");
        int op = scanner.nextInt();
        scanner.nextLine();
        switch(op){
            case 1:
                adicionarFuncionario();
                menu();
                break;
            case 2:
                adicionarUsuario();
                menu();
                break;
            case 3:
                adicionarLivro();
                menu();
                break;
            case 4:
                adicionarEditora();
                menu();
                break;
            case 5:
                adicionarAutor();
                menu();
                break;
            case 0:
                menu();
                break;
            default:
                System.out.println("Opção inválida!");
                menuAdd();
                break;
        }
    }

    public void menuRemover(){
        System.out.println("1 - Remover Funcionario");
        System.out.println("2 - Remover Usuário");
        System.out.println("3 - Remover Livro");
        System.out.println("4 - Remover Editora");
        System.out.println("5 - Remover Autor");
        System.out.println("0 - Voltar");
        int op = scanner.nextInt();
        scanner.nextLine();
        switch(op){
            case 1:
                System.out.println("Digite o CPF: ");
                String cpf = scanner.nextLine();
                controle.removerFuncionario(cpf);
                menu();
                break;
            case 2:
                System.out.println("Digite o CPF: ");
                String cp = scanner.nextLine();
                controle.removerUsuario(cp);
                menu();
                break;
            case 3:
                System.out.println("Digite o código: ");
                int codigo = scanner.nextInt();
                controle.removerLivro(codigo);
                menu();
                break;
            case 4:
                System.out.println("Digite o código: ");
                int cod = scanner.nextInt();
                controle.removerEditora(cod);
                menu();
                break;
            case 5:
                System.out.println("Digite o código: ");
                int code = scanner.nextInt();
                controle.removerAutor(code);
                menu();
                break;
            case 0:
                menu();
                break;
            default:
                System.out.println("Opção inválida!");
                menuRemover();
                break;
        }
    }

    public void menuEditar(){
        System.out.println("1 - Editar Funcionário");
        System.out.println("2 - Editar Usuário");
        System.out.println("3 - Editar Livro");
        System.out.println("4 - Editar Editora");
        System.out.println("5 - Editar Autor");
        System.out.println("0 - Voltar");
        int op = scanner.nextInt();
        scanner.nextLine();
        switch(op){
            case 1:
                editarFuncionario();
                menu();
                break;
            case 2:
                editarUsuario();
                menu();
                break;
            case 3:
                editarLivro();
                menu();
                break;
            case 4:
                editarEditora();
                menu();
                break;
            case 5:
                editarAutor();
                menu();
                break;
            case 0:
                menu();
                break;
            default:
                System.out.println("Opção inválida!");
                menuEditar();
                break;
        }
    }

    public void menuListar(){
        System.out.println("1 - Listar Funcionários");
        System.out.println("2 - Listar Usuários");
        System.out.println("3 - Listar Livros");
        System.out.println("4 - Listar Editoras");
        System.out.println("5 - Listar Autores");
        System.out.println("0 - Voltar");
        int op = scanner.nextInt();
        scanner.nextLine();
        switch(op){
            case 1:
                controle.listarFuncionarios();
                menu();
                break;
            case 2:
                controle.listarUsuarios();
                menu();
                break;
            case 3:
                controle.listarLivros();
                menu();
                break;
            case 4:
                controle.listarEditoras();
                menu();
                break;
            case 5:
                controle.listarAutores();
                menu();
                break;
            case 0:
                menu();
                break;
            default:
                System.out.println("Opção inválida!");
                menuListar();
                break;
        }
    }
}