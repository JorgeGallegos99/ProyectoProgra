package proyectoprogra;



public class Estudiante extends Persona{
    //atributos
    private float[] notas = new float[3];
    private float promedio;
    
    public Estudiante(){
        promedio = 0;
        for(int i = 0; i < notas.length; i++){
            notas[i] = 0;
        }
    }
    
    @Override
    public void ingresar(){
        super.ingresar();
        System.out.print("Nota Deberes: ");
        notas[0] = validarNota();
        System.out.print("Nota Lecciones: ");
        notas[1] = validarNota();
        System.out.print("Nota Evaluacion: ");
        notas[2] = validarNota();
    }

    @Override
    public String toString(){
        return super.toString() + ", Promedio: " + calcularPromedio();
    }
    
    public float validarNota(){
        boolean bandera = true;
        float nota = 0;
        do{
            nota = Leer.datosFloat();            
            if(nota >-1 && nota < 21){
                bandera = false;
            }else{
                System.out.print("Nota Mal Ingresada \nIntente Nuevamente: ");
                bandera = true;
            }
        }while(bandera);
        return nota;
    }

    public float calcularPromedio(){
        for(int i = 0; i < notas.length; i++){
            promedio += getNotas()[i];
        }
        promedio /= 3;
        return getPromedio();
    }
    /**
     * @return the notas
     */
    public float[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    /**
     * @return the promedio
     */
    public float getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
}
