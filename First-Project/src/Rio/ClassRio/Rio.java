package Rio.ClassRio;

public class Rio {
    private String Nome;
    private float Nivel;
    private boolean Poluido;

    //Construtor
    public Rio(String nome,
               float nivel,
               boolean poluido){
        this.Nome = nome;
        this.Nivel = nivel;
        this.Poluido = poluido;
    };

    public Rio(){
        this.Nome = "Ainda nao definido";
        this.Nivel = 0;
        this.Poluido = false;
    };
    //Metodos
    public void rain(float x){ this.Nivel = x;};

    public void sunny(float x){ this.Nivel -= x;};

    public void clean(boolean x){this.Poluido = x;};

    public void dirty(boolean x){this.Poluido = x;};

    public String getRio(){
        return ("Nome: " + this.Nome
                +"\n Nível: " + this.Nivel
                +"\n Poluido: " + this.Poluido
        );
    };

};
