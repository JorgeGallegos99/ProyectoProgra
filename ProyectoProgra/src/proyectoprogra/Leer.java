package proyectoprogra;

import java.io.*;

public class Leer {

    public static String datos(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader leer = new BufferedReader(isr);
        String texto = " ";
        try{
            texto = leer.readLine();
        }catch(IOException ex){
            System.err.println("ERROR..." + ex.toString());
        }
        return texto;
    }
    
    public static int datosInt(){
        boolean condicion = true;
        do{
            try{
                return Integer.parseInt(datos());
            }catch(NumberFormatException ex){
                System.err.print("ERROR..." + ex.toString() + "\nIntente de nuevo: ");
                condicion = true;
            }
        }while(condicion);
        return Integer.MAX_VALUE;
    }
    
    public static float datosFloat(){
        boolean condicion = true;
        do{
            try{
                return Float.parseFloat(datos());
            }catch(NumberFormatException ex){
                System.err.print("ERROR..." + ex.toString() + "\nIntente de nuevo: ");

                condicion = true;
            }
        }while(condicion);
        return Float.MAX_VALUE;
    }
    public static double datosDouble(){
        boolean condicion = true;
        do{
            try{
                return Double.parseDouble(datos());
            }catch(NumberFormatException ex){
                System.err.print("ERROR..." + ex.toString() + "\nIntente de nuevo: ");

                condicion = true;
            }
        }while(condicion);
        return Double.MAX_VALUE;
    }

    public static char datosCharMayuscula(){
        boolean condicion = true;
        do{
            try{
                return datos().toUpperCase().charAt(0);
            }catch(StringIndexOutOfBoundsException ex){
                System.err.print("ERROR..." + ex.toString() + "\nIntente de nuevo: ");
            }
        }while(condicion);
        return datos().toUpperCase().charAt(0);
    }
    
    public static char datosCharMinuscula(){
        boolean condicion = true;
        do{
            try{
                return datos().toLowerCase().charAt(0);
            }catch(StringIndexOutOfBoundsException ex){
                System.err.print("ERROR..." + ex.toString() + "\nIntente de nuevo: ");
            }
        }while(condicion);
        return datos().toLowerCase().charAt(0);
    }
}
