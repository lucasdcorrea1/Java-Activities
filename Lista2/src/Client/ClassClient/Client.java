package Client.ClassClient;

public class Client {
    private String NumberAccount;
    private String NumberAgency;
    private String Name;
    private float Balance;

    //Construtores
    public Client(String numberAccount,
                        String numberAgency,
                        String name,
                        float balance){
        this.setNumberAccount(numberAccount);
        this.setNumberAgency(numberAgency);
        this.setName(name);
        this.setBalance(balance);
    };

    public Client(){
        this.NumberAccount = "Não tem conta";
        this.NumberAgency = "Não tem agencia";
        this.Name = "Não tem nome";
        this.Balance = 0;
    };

    //setters
    //set
    public void setNumberAccount(String numberAccount){
        if (numberAccount.length() == 8 && (numberAccount.charAt(6) == '-')) {
            this.NumberAccount = numberAccount;
        }
        else {
            System.out.println("Numero da conta inválida");
        };
    };

    public void setNumberAgency(String numberAgency){
        if (numberAgency.length() == 6 && (numberAgency.charAt(4) == '-')) {
            this.NumberAgency = numberAgency;
        }
        else {
            System.out.println("Numero da agencia inválida");
        };
    };

    public void setBalance(float balance){
        if (balance >= 0);
        this.Balance = balance;
    };

    public void setName(String name){
        if (name.length() <= 30) {
            this.Name = name;
        }
        else {
            System.out.println("Nome invalido");
        };
    };

    //Get
    public String getName(){
        return this.Name;
    };
    public String getNumberAccount(){
        return this.NumberAccount;
    };
    public String getNumberAgency(){
        return this.NumberAgency;
    };
    public float getBalance(){
        return this.Balance;
    };

    //Metodos
    public void withdraw(float x){
        this.setBalance(this.Balance -= x);
    };
    public void deposit(float x){
        this.setBalance(this.Balance += x);
    };

    public String getClient(){
        return "Nome: " + this.Name
                + "\n Numero da conta: " + this.NumberAccount
                + "\n Numero da agencia: " + this.NumberAgency
                + "\n Saldo: " + this.Balance;
    };
};
