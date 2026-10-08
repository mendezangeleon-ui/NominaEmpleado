public class Nomina
{
    //Declaración de campos
    private String clave;
    private String nombre;
    private int horasTrabajadas;
    private double pagoPorHora;

    //Declaración de constructor
        public Nomina(String clave, String nombre, int horasTrabajadas, double pagoPorHora)
        {
        this.clave = clave;
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
        }


    public int getHorasCalculadas(int horasTrabajadas)
    {
        this.horasTrabajadas = horasTrabajadas;
        return horasTrabajadas;
    }

    public int calcularHorasNormales()
    {
        if(horasTrabajadas > 40)
        {
            return 40;
        }
        else
        {
            return horasTrabajadas;
        }
    }
    public int calcularHorasExtras()
    {
        if(horasTrabajadas > 50)
        {
            return 10;
        }
        else if(horasTrabajadas > 40)
        {
            return horasTrabajadas - 40;
        }
        else
        {
          return 0;
        }
    }
    public double calcularPagoNormal()
    {
        if(horasTrabajadas > 40)
        {
             return  40 * pagoPorHora;

        } else
        {
        return horasTrabajadas * pagoPorHora;
        }
    }
    public double calcularPagoExtra()
    {
      if((horasTrabajadas > 40) && (horasTrabajadas <= 50))
      {
          return  (horasTrabajadas - 40) *pagoPorHora * 2;
      } else if (horasTrabajadas > 50)
      {
       return 10 * pagoPorHora * 2;

      }
      else
      {
          return 0;
      }
    }
    public double calcularPagoTotal()
    {
        return calcularPagoNormal() + calcularPagoExtra();

    }
}
