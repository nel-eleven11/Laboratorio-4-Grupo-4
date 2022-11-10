/*
 * authores: Nelson  García, Oscar Fuentes, Jose Joaquín Campos
 * 
 * fecha: 10-11-2022
 * clase radio
 */

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class radio implements modo_estado, modo_radio, modo_volumen, modo_productividad, modo_reproduccion, modo_telefono {

    private ArrayList<cancion> canciones;
    private ArrayList<contacto> contactos;
    private ArrayList<double[]> emisoras;
    private String modulacion;
    private String estado;
    private Boolean conectar;
    private double emisora;
    private int volumen;
    private int posicion;
    private String modo_audio;

    public radio(){
        canciones = new ArrayList<cancion>();
        contactos = new ArrayList<contacto>();
        emisoras = new ArrayList<double[]>();
        modulacion = "FM";
        estado = "Off";
        conectar = false;
        emisora = 0;
        volumen = 0;
        posicion = 0;
        modo_audio = "speaker";
    }

    public String getmodulacion(){
        return modulacion;
    }

    public String getestado(){
        return estado;
    }

    public Boolean getconectar(){
        return conectar;
    }

    public double getemisora(){
        return emisora;
    }

    public int getvolumen(){
        return volumen;
    }   

    public int getposicion(){
        return posicion;
    }

    public String getmodo_audio(){
        return modo_audio;
    }

    public void setmodulacion(String modulacion){
        this.modulacion = modulacion;
    }

    public void setestado(String estado){
        this.estado = estado;
    }

    public void setconectar(Boolean conectar){
        this.conectar = conectar;
    }

    public void setemisora(double emisora){
        this.emisora = emisora;
    }

    public void setvolumen(int volumen){
        this.volumen = volumen;
    }

    public void setposicion(int posicion){
        this.posicion = posicion;
    }

    public void setmodo_audio(String modo_audio){
        this.modo_audio = modo_audio;
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
        
        if(conection == true){
            setconectar(true);
            JOptionPane.showMessageDialog(null, "Conectado");
        }else{
            setconectar(false);
            JOptionPane.showMessageDialog(null, "Desconectado");
        }
    }


    @Override
    public void contactos(ArrayList<contacto> lista) {
        
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).toString());
            
        }
    }


    @Override
    public void llamar(ArrayList<contacto> lista) {
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).toString());
            
        }
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de contacto que desea llamar"));
        JOptionPane.showMessageDialog(null, "Llamando a " + lista.get(opcion).getNombre());
 
    }


    @Override
    public void finalizar() {

        JOptionPane.showMessageDialog(null, "Llamada finalizada");        
    }


    @Override
    public void audio(Boolean eleccion) {

        if(eleccion == true){
            setmodo_audio("speaker");
            JOptionPane.showMessageDialog(null, "Modo de audio: " + getmodo_audio());
        }else{
            setmodo_audio("headphone");
            JOptionPane.showMessageDialog(null, "Modo de audio: " + getmodo_audio());
        }   
    }

    //metodo de modo_reproduccion

    @Override
    public void seleccionar(ArrayList<cancion> lista) {

        System.out.println("Estas son las canciones de la lista reproduccion:\n");
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).getNombre()+lista.get(i).getAutor()+lista.get(i).getDuracion()+lista.get(i).getGenero());
        }        
        
    }


    @Override
    public void cambiar_c(Boolean flag, ArrayList<cancion> lista) {

        if(flag == true){
            if(posicion < lista.size()){
                posicion++;
            }else{
                posicion = 0;
            }
        }else{
            if(posicion > 0){
                posicion--;
            }else{
                posicion = lista.size();
            }
        }  
        
    }


    @Override
    public void escuchar(ArrayList<cancion> lista) {

        System.out.println("Escuchando: "+lista.get(posicion).getNombre()+lista.get(posicion).getAutor()+lista.get(posicion).getDuracion()+lista.get(posicion).getGenero()); 
        
    }

    //metodo de modo_productividad

    @Override
    public String viajes(String destino) {

        Random ra = new Random();
        int distancia = ra.nextInt(150)+1; 
        int tiempo = ra.nextInt(20)+1; 
        String viaje="Para llegar a "+destino+" se tardara "+tiempo+"horas en recorrer "+distancia+"kilómetros";
        
        return viaje;
    }

    //metodo de modo_volumen

    @Override
    public void volumen(Boolean vol) {

        if(vol){
            volumen = volumen + 1;
            System.out.println("El volumen es de :"+volumen);
        }
        else{
            if(volumen==0) {
                System.out.println("El volumen es de : 0. No se puede bajar más");
            }           volumen = volumen - 1;
            System.out.println("El volumen es de :"+volumen);
        }
        
        
    }

    //metodo de modo_radio

    @Override
    public void cambiar(Boolean flag) {
        
       
        {
            String modulation;
            if (flag)
            {
                modulation="FM";
            }
            else
            {
                modulation="AM";
            }
            System.out.println("La modulación está en "+modulation);
        }
    }


    @Override
    public void cambiar_e(Boolean flag) {

        if(flag == true){
            if(posicion < emisoras.size()){
                posicion++;
            }else{
                posicion = 0;
            }
        }else{
            if(posicion > 0){
                posicion--;
            }else{
                posicion = emisoras.size();
            }
        }  
        System.out.println("La emisora es "+emisora);

    }


    @Override
    public void guardar(ArrayList<Double> lista, Double emisora_number) {
        if(lista.size()<50)
        {
        lista.add(emisora_number);
        System.out.println("Se ha guardado la emisora "+emisora_number);
        }
        else
        {
            System.out.println("No se puede guardar más emisoras");
        }
        
    }


    @Override
    public void cargar(ArrayList<Double> lista) {
        
        System.out.println("Estas son las emisoras guardadas:\n");
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        System.out.println("Cual desea que sea la nueva emisora");
        int o = JOptionPane.showConfirmDialog(null, "¿Qué emisora quiere?");
        emisora=lista.get(o-1); 
        }  
        
    }

    //metodo de modo_estado 

    @Override
    public void estado(Boolean es) {
        
        if(es)
        {
            System.out.println("On");
        }
        else
        {
            System.out.println("Off");
        }
    }

    
    
}
