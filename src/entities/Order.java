package entities;

import java.util.Date;

public class Order {
    private Date date;
    private Produtos produtos;

    public Order(Date date, Produtos produtos) {
        this.date = date;
        this.produtos = produtos;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Produtos getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }
}
