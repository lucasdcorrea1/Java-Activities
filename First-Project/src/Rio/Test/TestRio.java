package Rio.Test;

import javafx.application.Application;
import Rio.ClassRio.Rio;
import javafx.stage.Stage;

import javax.swing.*;

public class TestRio {

    public static void main(String[] args){
        //Iniciando variaveis
        String name = JOptionPane.showInputDialog("Informe um nome.");
        float nivel = 1;
        boolean poluido = false;

        //Iniciando Objeto
        Rio rio1 = new Rio(name, nivel, poluido);

        //Utilizando metodos
        rio1.rain(10 );
        rio1.sunny(5);
        rio1.clean(false);
        rio1.dirty(true);

        //Mostrando valores do objeto product2
        JOptionPane.showMessageDialog(
                null,
                rio1.getRio()
        );

    };

};


    //Criando objetos
