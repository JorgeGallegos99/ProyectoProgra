package proyectoprogra;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author cyber
 */
public class Principal {

    public static void main(String[] args) {
        
//        Ventana ventana = new Ventana();
//        ventana.setResizable(false);
//        ventana.setVisible(true);
        
        Estudiante est = new Estudiante();
        est.ingresar();
        System.out.println(est.toString());
        System.out.println("Nueva version");
    }
    
}
