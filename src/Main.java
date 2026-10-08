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
        String clave = entrada.nextLine();
        System.out.print("Ingresa tu nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Cantidad de horas trabajadas: ");
        int horasTrabajadas = entrada.nextInt();
        System.out.print("Ingresa tu pago por hora: ");
        double pagoPorHora = entrada.nextDouble();

        Nomina nominaEmpleado = new Nomina(clave, nombre, horasTrabajadas, pagoPorHora);

        System.out.println("================================");
        System.out.println("       RECIBO DE NOMINA         ");
        System.out.println("================================");
        System.out.println("Clave: " + nominaEmpleado.getClave());
        System.out.println("Empleado: " + nominaEmpleado.getNombre());
        System.out.println("Horas normales: " + nominaEmpleado.calcularHorasNormales());
        System.out.println("Horas extra: " + nominaEmpleado.calcularHorasExtras());
        System.out.println("Pago por hora: $" + nominaEmpleado.getPagoPorHora());
        System.out.println("Pago normal: $" + nominaEmpleado.calcularPagoNormal());
        System.out.println("Pago horas extra: $" + nominaEmpleado.calcularPagoExtra());
        System.out.println("--------------------------------");
        System.out.println("Pago total: $" + nominaEmpleado.calcularPagoTotal());
        System.out.println("================================");

        if (horasTrabajadas > 50) {
            System.out.println("Advertencia.Se capturaron más de 50 horas, solo se consideran 50.");
        }
    }

}
