package proyectoprogra;


/*clase en la que se define los principales atribuutos del empleado*/
public class Persona {
    //atributos
    private String nombre;
    private String numeroCedula;

    //constructor
    public Persona() {
        this.nombre = null;
        this.numeroCedula = null;
    }
    
    public void ingresar(){
        boolean bandera = true;
        System.out.print("Ingrese Nombre: ");
        this.setNombre(Leer.datos());
        do{
            System.out.print("Ingrese Numero de Cedula: ");
            this.setNumeroCedula(Leer.datos());
            bandera = validadorDeCedula(this.getNumeroCedula());
        }while(bandera);
        //https://argenis85.wordpress.com/2011/01/19/validarcedulaecuadorjava/
    }
    
    public boolean validadorDeCedula(String cedula) {
        boolean cedulaCorrecta = false;
        try {
            if (cedula.length() == 10 || cedula.length() == 9){
                int digitoProvincia = Integer.parseInt(cedula.substring(0, 2));
                if (digitoProvincia < 18 || digitoProvincia == 30) {
                // Coeficientes de validación cédula
                // El decimo digito se lo considera dígito verificador
                    int[] coefValCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
                    int verificador = Integer.parseInt(cedula.substring(9,10));
                    int suma = 0;
                    int digito = 0;
                    for(int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1))* coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }
                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    }else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    }else{
                        cedulaCorrecta = false;
                    }
                }else{
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        }catch (NumberFormatException ex) {
            cedulaCorrecta = false;
        } catch (Exception ex) {
        System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            cedulaCorrecta = false;
        }
        if (!cedulaCorrecta) {
        System.out.println("La Cédula ingresada es Incorrecta");
        }
        return !cedulaCorrecta;
}

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", NumeroCedula: " + numeroCedula;
    }


    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the numeroCedula
     */
    public String getNumeroCedula() {
        return numeroCedula;
    }

    /**
     * @param numeroCedula the numeroCedula to set
     */
    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }
}
