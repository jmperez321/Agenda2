import java.util.HashMap;
import java.util.List;

public class Controller {
    private int numCounterId;
    private HashMap<Integer, Contacto> hmContactos = new HashMap<>();

    public Controller() {
        this.numCounterId = 1;
    }

    public List<Contacto> agendaContactos() {
        return hmContactos.values().stream().toList();
    }

    public void crearContacto(String nom, String ape, String tlf, String mail) {
        int numId = numCounterId;
        Contacto nuevo = new Contacto(numId, nom, ape, tlf, mail);
        hmContactos.put(numId, nuevo);
        numCounterId++;
    }

    public void actuNomContacto(int idSelect, String nom) {
        hmContactos.get(idSelect).setNom(nom);
    }

    public void actuApellidoContacto(int idSelect, String apellido) {
        hmContactos.get(idSelect).setApellido(apellido);
    }

    public void actuTelefonoContacto(int idSelect, String tlf) {
        hmContactos.get(idSelect).setTelefon(tlf);
    }
    public void actuEmailContacto(int idSelect, String email) {
        hmContactos.get(idSelect).setEmail(email);
    }

}
