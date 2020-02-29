package Product.Test;

import Product.ClassProduct.Product;

import javax.swing.*;

public class TestProduct {

    public static void main(String[] args){

       //Criando objetos
        int id = 1;
        String description = JOptionPane.showInputDialog("Informe uma descrição!");
        int quantity = 1;
        float price = 100;

        //iniciando product1
        Product product1 = new Product(
                id,
                description,
                quantity,
                price
        );


        //Alterando variaveis para utilizar no objeto product2
        id = 2;
        description = JOptionPane.showInputDialog("Informe uma descrição!");
        quantity = 2;
        price = 200;

        //Utilizando metodos do objeto product2
        Product product2 = new Product(
                id,
                description,
                quantity,
                price
        );

        product1.buyProduct(10);

        product1.sellProduct(3);

        product1.increasePrice(5);

        product1.reducePrice(5);

        //Mostrando valores do objeto product1
        JOptionPane.showMessageDialog(
                null,
                product1.getProduct()
        );

        //Mostrando valores do objeto product2
        JOptionPane.showMessageDialog(
                null,
                product2.getProduct()
        );

    };

};
