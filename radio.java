import java.util.ArrayList;
import java.util.Random;

public class radio implements modo_estado, modo_radio, modo_volumen, productividad, reproduccion, telefono {

    private ArrayList<cancion> canciones;
    private ArrayList<contacto> contactos;
    private ArrayList<double[]> emisoras;

    public radio(){
        canciones = new ArrayList<cancion>();
        contactos = new ArrayList<contacto>();
        emisoras = new ArrayList<double[]>();
    }


    public ArrayList<cancion> getCanciones() {
        return this.canciones;
    }

    public void setCanciones(ArrayList<cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<contacto> getContactos() {
        return this.contactos;
    }

    public void setContactos(ArrayList<contacto> contactos) {
        this.contactos = contactos;
    }

    public ArrayList<double[]> getEmisoras() {
        return this.emisoras;
    }

    public void setEmisoras(ArrayList<double[]> emisoras) {
        this.emisoras = emisoras;
    }

    
    
}
