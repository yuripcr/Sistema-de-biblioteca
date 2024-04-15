package model;

public class Livros extends ItemBiblio implements Emprestavel{
    private int edicao, anoPublicacao, codigoEditora, codigoAutor;
    private String genero;

    public Livros(int codigo, String titulo, int edicao, int anoPublicacao, int codigoEditora, String genero, int codigoAutor) {
        super(codigo, titulo, "Disponível");
        this.edicao = edicao;
        this.anoPublicacao = anoPublicacao;
        this.codigoEditora = codigoEditora;
        this.genero = genero;
        this.codigoAutor = codigoAutor;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getCodigoEditora() {
        return codigoEditora;
    }

    public void setCodigoEditora(int codigoEditora) {
        this.codigoEditora = codigoEditora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

   @Override
   public void emprestar() {
        setStatus("Emprestado");
   }

   @Override
   public void devolver() {
       setStatus("Disponível");
   }

    public int getCodigoAutor() {
        return codigoAutor;
    }

    public void setCodigoAutor(int codigoAutor) {
        this.codigoAutor = codigoAutor;
    }
}
