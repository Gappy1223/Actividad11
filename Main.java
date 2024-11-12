import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué tipo de vehiculo es?: (1: Terrestre|2: Acuatico)");
        Integer opcion = scanner.nextInt();
        if (opcion == 1) {

            System.out.println("Ingrese el nombre de la marca: ");
            String marca = scanner.next();
            System.out.println("Ingrese el modelo: ");
            String modelo = scanner.next();
            System.out.println("Ingrese el año de fabricación: ");
            Integer anio_fabricacion = scanner.nextInt();
            Vehiculo_terrestre terrestre = new Vehiculo_terrestre(marca, modelo, anio_fabricacion);
            System.out.println(terrestre.mostrarInformacion());
            //Vehiculo vehiculo = new Vehiculo("Ford","Seal", 1900);
            //Vehiculo_terrestre terrestre = new Vehiculo_terrestre("Ford","Seal", 1900);
            //Vehiculo_acuatico acuatico = new Vehiculo_acuatico("Ford","Seal", 1900, 12);
        } else {
            System.out.println("Ingrese el nombre de la marca: ");
            String marca = scanner.next();
            System.out.println("Ingrese el modelo: ");
            String modelo = scanner.next();
            System.out.println("Ingrese el año de fabricación: ");
            Integer anio_fabricacion = scanner.nextInt();
            System.out.println("Ingrese el número de motores: ");
            Integer num_motor = scanner.nextInt();
            Vehiculo_acuatico acuatico = new Vehiculo_acuatico(marca, modelo, anio_fabricacion, num_motor);
            System.out.println(acuatico.mostrarInformacion());
        }


    }
}