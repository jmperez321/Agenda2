
public class Main {
    public static void main(String[] args) {
        Tui t = new Tui();
        Controller ctl = new Controller();
        boolean encendido = true;
        inicio(ctl, t);

    }

    //TODO crear los emtodos de la tui rojos.
    public static void inicio(Controller ctl, Tui t) {
        boolean encendido = true;
        int menuOption = t.menuInicio();
        while (encendido) {
            if (menuOption == 1) {
                gestionCrearContacto(ctl, t);
            } else if (menuOption == 2) {
                t.menuVerContact();
            } else if (menuOption == 3) {
                gestActuContact(ctl, t);
            } else if (menuOption == 4) {
                t.borrarContacto();
            } else if (menuOption == 5) {
                t.printSalir();
                encendido = false;
            }
        }
    }

    public static void gestionCrearContacto(Controller ctrl, Tui t) {
        String nom = null;
        String apellido = null;
        String telefono = null;
        String email = null;
        nom = t.crearNombre();
        apellido = t.crearApellido();
        telefono = t.crearTelefono();
        email = t.crearEmail();
        ctrl.crearContacto(nom, apellido, telefono, email);

    }

    public static void gestActuContact(Controller ctrl, Tui t) {
        int idSelect = t.selectContactById();
        int paramSelect = t.menuActuContact();
        if (paramSelect == 1) {
            String nom = t.crearNombre();
            ctrl.actuNomContacto(idSelect, nom);
        } else if (paramSelect == 2) {
            String ape = t.crearApellido();
            ctrl.actuApellidoContacto(idSelect, ape);
        } else if (paramSelect == 3) {
            String tlf = t.crearTelefono();
            ctrl.actuTelefonoContacto(idSelect, tlf);
        } else if (paramSelect == 4) {
            String email = t.crearEmail();
            ctrl.actuEmailContacto(idSelect, email);
        } else if (paramSelect == 5) {
            t.backMenu();
        } else {

        }

    }

}