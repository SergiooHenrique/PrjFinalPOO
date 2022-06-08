import java.util.ArrayList;
import java.util.List;

public class Cesta {

    List<Produto> itens = new ArrayList<>();

    public void adicionarItem (Produto p){
        itens.add(p);
    }

    public void exibirLista(){
        for (Produto prod :itens){
            System.out.println(prod.toString());
        }
    }

    public double calcularTotal (){
        double valorTotal = 0;

        for (Produto prod :itens){
            valorTotal += prod.getPreco();
        }

        return valorTotal;
    }
}
