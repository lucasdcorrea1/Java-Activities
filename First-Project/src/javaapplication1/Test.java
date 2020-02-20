package javaapplication1;

import javax.swing.JOptionPane;

public class Test {

    public static void main(String[] args) {
        //Criando objotos
        String model = JOptionPane.showInputDialog("Informe o modelo!");
        String brand = JOptionPane.showInputDialog("Informe a marca!");
        int motor = JOptionPane.showConfirmDialog(null,
                "Está ligado?", "Esta ligado?", JOptionPane.YES_OPTION);
        boolean motorData = (motor == JOptionPane.YES_OPTION);
        float speed = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a velocidade atua!"));
        
        Car obj1 = new Car(model, brand, motorData, speed);
        obj1.turnOn();
        obj1.speed(70);
        
        model = JOptionPane.showInputDialog("Informe o modelo!");
        brand = JOptionPane.showInputDialog("Informe a marca!");
        motor = JOptionPane.showConfirmDialog(null,
              "Está ligado?", "Esta ligado?", JOptionPane.YES_OPTION);
        motorData = (motor == JOptionPane.YES_OPTION);
        speed = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a velocidade atua!"));
        
        Car obj2 = new Car(model, brand, motorData, speed);
        obj2.turnOff();
        obj2.stop(30);
        
        JOptionPane.showMessageDialog(null, obj1.toString());
        JOptionPane.showMessageDialog(null, obj2.toString());
    }
    
};
