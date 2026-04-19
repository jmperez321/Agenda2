import java.sql.SQLOutput;
import java.util.Scanner;

public class Tui {
    Scanner sc = new Scanner(System.in);

    public int menuInicio(){
        System.out.println("""
                
                - - Bienvenido a tu agenda personal - -
                Escribe el numero de la opción deseada.
                1. Crear nuevo contactos.
                2. Ver contactos.
                3. Actualizar contactos.
                4. Eliminar contactos.
                5. Salir.\n""");
        return sc.nextInt();
    }

    public String crearNombre(){
        System.out.println("Escribe el NOMBRE:");
        return sc.nextLine();
    }
    public String crearApellido(){
        System.out.println("Escribe el APELLIDO:");
        return sc.nextLine();
    }
    public String crearTelefono(){
        System.out.println("Escribe el TELEFONO:");
        return sc.nextLine();
    }
    public String crearEmail(){
        System.out.println("Escribe el EMAIL:");
        return sc.nextLine();
    }

    public int menuVerContact(){
        System.out.println("""
                
                Escribe numero de la opción deseada:
                1. Mostrar todos.
                2. Buscar por ID.
                3. Volver.""");
        return sc.nextInt();
    }
    public int selectContactById(){
        System.out.println("""
                Escribe el ID del contacto:
                """);
        return sc.nextInt();
    }

    public void borrarContacto(){
        System.out.println("""             
                Has escogido la opción de borrar contacto, por favor...
                """);
    }
    public int menuActuContact(){
        System.out.println("""
                
                Escribe el numero de la opcion deseada:
                1. Nombre.
                2. Apellido.
                3. Telefono.
                4. Email.
                5. Volver.
                """);
        return sc.nextInt();
    }
    public void backMenu(){
        System.out.println("Volviendo al menú...");
    }
    public void printSalir(){
        System.out.println("Cerrando aplicación...");
    }


}
