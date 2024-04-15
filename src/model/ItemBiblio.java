package model;

abstract class ItemBiblio {
    protected int codigo;
    protected String titulo, status;

    public ItemBiblio(int codigo, String titulo, String status) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.status = "Disponível"; //padrão
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
