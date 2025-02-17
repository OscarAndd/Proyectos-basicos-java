import java.util.*;

public class RecibirDatos {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        var rand= new Random();
        System.out.println("Ingrese su nombre");
        var nombre=entrada.nextLine();

        System.out.println("Ingrese su apellido");
        var apellido=entrada.nextLine();

        System.out.println("Ingrese su fecha de nacimiento");
        var fecha=entrada.nextLine();

        var numAleatorio=rand.nextInt(0,9999);

        var Id1=(nombre.substring(0,2)+apellido.substring(0,2)+fecha.substring(2)).toUpperCase();

        System.out.printf("""
                Hola %s
                Tu nuevo numero de identificacion (ID) generado por el sistema es:
                %s%04d
                Felicidades!
                """,nombre,Id1,numAleatorio);

    }
}
