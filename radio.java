import java.util.ArrayList;
import java.util.Random;

public class radio implements modo_estado, modo_radio, modo_volumen, modo_productividad, modo_reproduccion, modo_telefono {

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

    //metodo de modo_telefono
    @Override
    public void conexion(boolean conection) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void contactos(ArrayList<contacto> lista) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void llamar(ArrayList<contacto> lista) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void finalizar() {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void audio(Boolean flag) {
        // TODO Auto-generated method stub
        
    }

    //metodo de modo_reproduccion

    @Override
    public void seleccionar(ArrayList<cancion> lista) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void cambiar_c(Boolean flag, ArrayList<cancion> lista) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void escuchar(ArrayList<cancion> lista) {
        // TODO Auto-generated method stub
        
    }

    //metodo de modo_productividad

    @Override
    public String viajes(String destino) {
        // TODO Auto-generated method stub
        return null;
    }

    //metodo de modo_volumen

    @Override
    public void volumen(Boolean flag) {
        // TODO Auto-generated method stub
        
    }

    //metodo de modo_radio

    @Override
    public void cambiar(Boolean flag) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void cambiar_e(Boolean flag) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void guardar(ArrayList<Double> lista, Double emisora_number) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void cargar(ArrayList<Double> lista) {
        // TODO Auto-generated method stub
        
    }

    //metodo de modo_estado

    @Override
    public void estado(Boolean state) {
        
        if(state)
        {
            System.out.println("Encendido");
        }
        else
        {
            System.out.println("Apagado");
        }
    }

    
    
}