import java.util.ArrayList;

public class radio {

    private ArrayList<cancion> canciones;
    private ArrayList<contacto> contactos;
    private ArrayList<float[]> emisoras;

    public radio(){
        canciones = new ArrayList<cancion>();
        contactos = new ArrayList<contacto>();
        emisoras = new ArrayList<float[]>();
    }

    public void agregarCancion(cancion cancion){
        canciones.add(cancion);
    }

    public void agregarContacto(contacto contacto){
        contactos.add(contacto);
    }
    
    public void agregarEmisora(float[] emisora){
        emisoras.add(emisora);
    }

    public void eliminarCancion(cancion cancion){
        canciones.remove(cancion);
    }

    public void eliminarContacto(contacto contacto){
        contactos.remove(contacto);
    }

    public void eliminarEmisora(float[] emisora){
        emisoras.remove(emisora);
    }

    public void mostrarCanciones(){
        for (cancion cancion : canciones) {
            System.out.println(cancion.toString());
        }
    }

    public void mostrarContactos(){
        for (contacto contacto : contactos) {
            System.out.println(contacto.toString());
        }
    }

    public void mostrarEmisoras(){
        for (float[] emisora : emisoras) {
            System.out.println(emisora.toString());
        }
    }

    
}
