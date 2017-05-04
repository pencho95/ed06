/*
Copia
*/

package ed06_tareaproyecto;

/**
 *
 * @author ED06
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("1245678M","Perico de los Palotes");
        
        imprimir_emp(empleado1);
    }

    private static void imprimir_emp(Empleado empleado1) {
        empleado1.direccion="C/del Pez,6";
        empleado1.setNumHijos(3);
        System.out.println("DNI: "+empleado1.getDni());
        System.out.println("Nombre: "+empleado1.getNombre());
        System.out.println("Cargo: "+empleado1.getCargo());
        System.out.println("Número de hijos: "+empleado1.getNumHijos());
        System.out.println("Sueldo: "+empleado1.calcula_sueldo(1200));
    }
    
}
