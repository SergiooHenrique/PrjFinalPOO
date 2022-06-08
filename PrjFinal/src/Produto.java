public class Produto {

    private int codigo;
    private String descricao;
    private double preco;
    private int quantidade;
    private Fornecedor fornecedor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto (int codigo, String descricao, double preco, int quantidade, Fornecedor fornecedor){
        if (codigo > 0 && preco > 0 && quantidade > 0){
            this.codigo = codigo;
            this.descricao = descricao;
            this.preco = preco;
            this.quantidade = quantidade;
            this.fornecedor = fornecedor;
        } else {
            System.out.println("Codigo, preco ou quantidade invalidos");
        }
    }

    @Override
    public String toString() {
        return "---------------------------------------- \n" +
                "Dados do Produto \n" +
                "Codigo: " + this.codigo + "\n" +
                "Descricao: " + this.descricao + "\n" +
                "Preco: " + this.preco + "\n" +
                "Quantidade: " + this.quantidade + "\n" +
                this.fornecedor + "\n" +
                "---------------------------------------- \n";
    }
}
