package javaapplication1;

public class Product {
    private int Id;
    private String Description;
    private int Qtd;
    private float Price;

    public Product(String Description,
                   int qtd,
                   float price){
        this.Description = Description;
        this.Qtd = qtd;
        this.Price = price;
    };

    public void Buy () {}

};
