package Product.ClassProduct;

public class Product {
    private int Id;
    private String Description;
    private int Quantity;
    private float Price;

    //Construtor
    public Product(int id,
                   String description,
                   int quantity,
                   float price){
        this.Id = id;
        this.Description = description;
        this.Quantity = quantity;
        this.Price = price;
    };
    public Product(){
        this.Id = 0;
        this.Description = "Sem descrição";
        this.Quantity = 0;
        this.Price = 0;
    };

    //setters

    //Set atribui um valor
    //Set
    public void setQuantity(int quantity){
      this.Quantity = quantity;
    };

    public void setDescription(String description){
        this.Description = description;
    };

    public void setId(int id){
        this.Id = id;
    };

    public void setPrice(float price){
        if ( price >= 0 ){
            this.Price = price;
        }
        else {
            System.out.println("Preco invalido!");
        };
    };

    //Get retorna um valor
    //Gets
    public int getId(){
        return this.Id;
    };
    public String setDescription(){
        return this.Description;
    };
    public int getQuantity(){
        return this.Quantity;
    };
    public float getPrice(){
        return this.Price;
    };

    //Metodos
    public void buyProduct (int x) {this.Quantity += x;};

    public void sellProduct (int x) {this.Quantity -= x;};

    public void increasePrice (float x){this.Price += x;};

    public void reducePrice(float x){
        this.setPrice(this.Price -= x);
    };

    public String getProduct(){
        return ("Id: " + this.Id
                +"\n Descrição: " + this.Description
                +"\n Quantidade: " + this.Quantity
                +"\n Preço: " + this.Price
        );
    };
};
