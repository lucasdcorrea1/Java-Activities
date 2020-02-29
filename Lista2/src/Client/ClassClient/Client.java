package Client.ClassClient;

public class Client {
    private String NumberAccount;
    private String NumberAgency;
    private String Name;
    private float Balance;

    public Client(String numberAccount,
                        String numberAgency,
                        String name,
                        float balance){
        this.NumberAccount = numberAccount;
        this.NumberAgency = numberAgency;
        this.Name = name;
        this.Balance = balance;

    };
    public Client(){
        this.NumberAccount = "Não tem conta";
        this.NumberAgency = "Não tem agencia";
        this.Name = "Não tem nome";
        this.Balance = 0;

    };

    public void setNumberAccount(String numberAccount){
        if (numberAccount.length() == 8 && (numberAccount.charAt(6) == '-')) {
            this.NumberAccount = numberAccount;
        }else {
            System.out.println("Numero da conta inválida");
        }
    };

    public void setNumberAgency(String numberAgency){
        if (numberAgency.length() == 6 && (numberAgency.charAt(4) == '-')) {
            this.NumberAgency = numberAgency;
        }else{
            System.out.println("Numero da agencia inválida");
        };
    };
};
