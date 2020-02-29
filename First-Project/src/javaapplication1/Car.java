package javaapplication1;

/**@author Lucas Damas*/

public class Car {
    
    private String modelo, marca; 
    private boolean motor; 
    private float velAtual;
    
    //Construtor
    public Car( String modelo, 
                String marca,
                boolean motor, 
                float velAtual){
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
        this.velAtual = velAtual;
    };
    
    //METODOS   
    public void turnOn () {
        this.motor = true;
    }
    public void turnOff () {
        this.motor = false;
    }   
    public void speed (float x){
        this.velAtual = this.velAtual + x;
    }
    public void stop(float x){
        this.velAtual = this.velAtual - x;
    }    
    
    public String getCar(){
        return ("Modelo:" + this.modelo
                +"\n Marca: " + this.marca
                +"\n Motor: " + this.motor
                +"\n Vel Atual: " + this.velAtual
        );
    }
}
