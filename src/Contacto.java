public class Contacto {
    private int id ;
    private String nom;
    private String apellido;
    private String telefon;
    private String email;

    //CONSTRUCTOR
    public Contacto(int id, String nom, String apellido, String telefon, String email) {
        this.id = id;
        this.setNom(nom);
        this.setApellido(apellido);
        this.setTelefon(telefon);
        this.setEmail(email);
    }

    //GETTERS
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

    //SETTERS
       public void setNom(String nom) {
        this.nom = nom;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return id + " - "+ nom +" "+ apellido + " | " + telefon + " | " + email;
    }
}
