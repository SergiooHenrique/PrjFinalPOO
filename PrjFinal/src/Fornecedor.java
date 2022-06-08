public class Fornecedor {
    private int codigo;
    private String razaoSocial;
    private String endereco;
    private String cidade;
    private String estado;

    private Contato contato;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Fornecedor (int codigo, String razaoSocial, String endereco, String cidade, String estado, Contato contato){
        if (codigo > 0 && estado.length() == 2){
            this.codigo = codigo;
            this.razaoSocial = razaoSocial;
            this.endereco = endereco;
            this.cidade = cidade;
            this.estado = estado;
            this.contato = contato;
        } else {
            System.out.println("Codigo ou estado invalidos");
        }
    }

    public Fornecedor (int codigo, String razaoSocial, String endereco, Contato contato){
        if (codigo > 0){
            this.codigo = codigo;
            this.razaoSocial = razaoSocial;
            this.endereco = endereco;
            this.cidade = "Mogi Mirim";
            this.estado = "SP";
            this.contato = contato;
        } else {
            System.out.println("Codigo invalido");
        }
    }

    @Override
    public String toString() {
        return "Dados do fornecedor \n" +
                "Codigo: " + this.codigo + "\n" +
                "Razao Social: " + this.razaoSocial + "\n" +
                "Endereco: " + this.endereco + "\n" +
                "Cidade: " + this.cidade + "\n" +
                "Estado: " + this.estado + "\n" +
                "Contato: " + this.contato + "\n";
    }
}
