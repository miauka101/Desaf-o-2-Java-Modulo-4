import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloca una fecha de nacimiento de una persona 1, Escribelo en DD/MM/AAAA:");
        String fecha1= sc.nextLine();

        System.out.println("Coloca una fecha de nacimiento de una persona 2, Escribelo en DD/MM/AAAA:");
        String fecha2= sc.nextLine();

        //parseo del String que da el usuario a int primera fecha
        int dia1 = Integer.parseInt(fecha1.substring(0,2)); //extraccion del 1er dia
        int mes1 = Integer.parseInt(fecha1.substring(3,5)); //extraccion del 1er mes
        int anio1 = Integer.parseInt(fecha1.substring(6,10)); //extraccion del 1er año

        //parseo del String que da el usuario a int segunda fecha
        int dia2 = Integer.parseInt(fecha2.substring(0,2)); //extraccion del 2do dia
        int mes2 = Integer.parseInt(fecha2.substring(3,5)); //extraccion del 2do mes
        int anio2 = Integer.parseInt(fecha2.substring(6,10)); //extraccion del 2do año

        //cual de las dos fechas es mayor

        //que año es mayor
        if (anio1<anio2) {
            System.out.println("La persona 1 es mayor");
        } else if (anio1>anio2) {
            System.out.println("La persona 2 es mayor");
        } else { //no salio ningun año mas grande que ninguno, asique vemos los meses
            if (mes1<mes2){
                System.out.println("La persona 1 es mayor");
            } else if (mes1>mes2) {
                System.out.println("La persona 2 es mayor");
            } else {//no salio ningun mes mas grande que ninguno, asique vemos el dia
                if (dia1<dia2){
                    System.out.println("La persona 1 es mayor");
                } else if (dia1>dia2) {
                    System.out.println("La persona 2 es mayor");
                } else { //fue, los dos nacieron el mismo dia
                    System.out.println("Las dos personas tienen la misma edad");
                }
            }
        }
    }
}
