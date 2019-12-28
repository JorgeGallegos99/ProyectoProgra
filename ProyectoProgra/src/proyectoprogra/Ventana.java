package proyectoprogra;



import java.awt.Color;

public class Ventana extends javax.swing.JFrame{
    
    public Ventana(){
        super("Mi ventana");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);

        this.iniciarComponentes(); //iniciando los componentes
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
    private void iniciarComponentes(){
        javax.swing.JPanel panel = new  javax.swing.JPanel(); //creacion del panel
        javax.swing.JLabel etiqueta1 = new  javax.swing.JLabel("****Menu de Opciones***"); //creacion de una etiqueta
        
        panel.setLayout(null);
        this.getContentPane().add(panel);//anadiendo el panel a la ventana
        
        etiqueta1.setBounds(180, 20, 140, 20);
        etiqueta1.setForeground(Color.RED); //color de letra 
        etiqueta1.setOpaque(true);
        etiqueta1.setBackground(Color.yellow);//color del fondo etiqueta
        
        
        panel.add(etiqueta1);
       
        
        
       
        
    }
}
