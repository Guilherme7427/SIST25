package Estoque_de_Produtos.Entities;

public class Controle {
    public String name;
    public double price;
    public int quantity;

    public double totalValuesInStock(){
        return price * quantity;
    }

    public String showData() {
        return "Name: "+name+ " price: "+price+ " quantity: "+quantity+ " total: "+totalValuesInStock();
    }

    public void addProducts(int q) {
        if (q>0) {
            quantity += q;
        }
    }

    public void removeProducts(int q) {
        if (q <= quantity && q > 0) {
            quantity -= q;
        }
    }
}
