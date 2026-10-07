import java.util.Scanner;

public class Main
{
    //Punto de entrada del código
    public static void main(String[] args)
    {
        System.out.println("Sistema de nomina de empleados");

        //Creacion de scanner
        Scanner entrada = new Scanner(System.in);

        //Ingreso y guardado de datos
        System.out.print("Ingresa tu clave: ");
        String clave = entrada.next();
        System.out.print("Ingresa tu nombre: ");
        String nombre = entrada.next();
        System.out.print("Cantidad de horas trabajadas: ");
        int horasTrabajadas = entrada.nextInt();
        System.out.print("Ingresa tu pago por hora: ");
        double pagoPorHora = entrada.nextDouble();

        Nomina nominaEmpleado = new Nomina();
    }

}
