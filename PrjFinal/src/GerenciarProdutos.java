public class GerenciarProdutos {

    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Contato 1");
        contato.setEmail("test@email.com");
        contato.setTelefone("19978453652");

        Fornecedor fornecedor1 = new Fornecedor(1, "teste", "rua teste", contato);
        Fornecedor fornecedor2 = new Fornecedor(2, "teste 2", "rua teste 2", "Guacu", "SP", contato);

        Produto prod1 = new Produto(10, "produto 1", 12, 3, fornecedor1);
        Produto prod2 = new Produto(20, "produto 2", 15, 1, fornecedor2);
        Produto prod3 = new Produto(30, "produto 3", 32, 7, fornecedor1);
        Produto prod4 = new Produto(40, "produto 4", 10, 12, fornecedor2);

        Cesta cesta = new Cesta();
        cesta.adicionarItem(prod1);
        cesta.adicionarItem(prod2);
        cesta.adicionarItem(prod3);
        cesta.adicionarItem(prod4);

        cesta.exibirLista();

        System.out.println("Valor total da Cesta: " + cesta.calcularTotal());
    }
}