import java.util.ArrayList;
import java.util.Random;

import java.util.Scanner;


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

    
    /** 
     * @return String
     */
    public String getmodulacion(){
        return modulacion;
    }

    
    /** 
     * @return String
     */
    public String getestado(){
        return estado;
    }

    
    /** 
     * @return Boolean
     */
    public Boolean getconectar(){
        return conectar;
    }

    
    /** 
     * @return double
     */
    public double getemisora(){
        return emisora;
    }

    
    /** 
     * @return int
     */
    public int getvolumen(){
        return volumen;
    }   

    
    /** 
     * @return int
     */
    public int getposicion(){
        return posicion;
    }

    
    /** 
     * @return String
     */
    public String getmodo_audio(){
        return modo_audio;
    }

    
    /** 
     * @param modulacion
     */
    public void setmodulacion(String modulacion){
        this.modulacion = modulacion;
    }

    
    /** 
     * @param estado
     */
    public void setestado(String estado){
        this.estado = estado;
    }

    
    /** 
     * @param conectar
     */
    public void setconectar(Boolean conectar){
        this.conectar = conectar;
    }

    
    /** 
     * @param emisora
     */
    public void setemisora(double emisora){
        this.emisora = emisora;
    }

    
    /** 
     * @param volumen
     */
    public void setvolumen(int volumen){
        this.volumen = volumen;
    }

    
    /** 
     * @param posicion
     */
    public void setposicion(int posicion){
        this.posicion = posicion;
    }

    
    /** 
     * @param modo_audio
     */
    public void setmodo_audio(String modo_audio){
        this.modo_audio = modo_audio;
    }
 
    
    /** 
     * @return ArrayList<cancion>
     */
    public ArrayList<cancion> getCanciones() {
        return this.canciones;
    }

    
    /** 
     * @param canciones
     */
    public void setCanciones(ArrayList<cancion> canciones) {
        this.canciones = canciones;
    }

    
    /** 
     * @return ArrayList<contacto>
     */
    public ArrayList<contacto> getContactos() {
        return this.contactos;
    }

    
    /** 
     * @param contactos
     */
    public void setContactos(ArrayList<contacto> contactos) {
        this.contactos = contactos;
    }

    
    /** 
     * @return ArrayList<double[]>
     */
    public ArrayList<double[]> getEmisoras() {
        return this.emisoras;
    }

    
    /** 
     * @param emisoras
     */
    public void setEmisoras(ArrayList<double[]> emisoras) {
        this.emisoras = emisoras;
    }

    
    /** 
     * @param coneccion
     */
    //metodo de modo_telefono
    @Override
    public void conexion(boolean coneccion) {
       
        
        if(coneccion == true){
            setconectar(true);
            System.out.println("Conectado");
            
        }else{
            setconectar(false);
            System.out.println("Desconectado");
            
        }
    }


    
    /** 
     * @param lista
     */
    @Override
    public void contactos(ArrayList<contacto> lista) {
        
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).toString());
            
        }
    }


    
    /** 
     * @param lista
     */
    @Override
    public void llamar(ArrayList<contacto> lista) {
        int contador = 0;
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i < lista.size(); i++){
            System.out.println(contador +". "+ lista.get(i).toString());
            contador = contador +1;
        }
        System.out.println("Ingrese el numero del contacto que desea llamar");
        int numero = keyboard.nextInt();

        if(numero < lista.size()){
            System.out.println("Llamando a: " + lista.get(numero).toString());
        }else{
            System.out.println("El contacto no existe");
        }
    }


    @Override
    public void finalizar() {

        System.out.println("Llamada finalizada");       
    }


    
    /** 
     * @param eleccion
     */
    @Override
    public void audio(Boolean eleccion) {

        if(eleccion == true){
            setmodo_audio("speaker");
            System.out.println("Modo de audio: " + getmodo_audio());
        }else{
            setmodo_audio("headphone");
            System.out.println("Modo de audio: " + getmodo_audio());
        }   
    }

    
    /** 
     * @param lista
     */
    //metodo de modo_reproduccion

    @Override
    public void seleccionar(ArrayList<cancion> lista) {

        System.out.println("Estas son las canciones de la lista reproduccion:\n");
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).getNombre()+lista.get(i).getAutor()+lista.get(i).getDuracion()+lista.get(i).getGenero());
        }        
        
    }


    
    /** 
     * @param resp
     * @param lista
     */
    @Override
    public void cambiar_c(Boolean resp, ArrayList<cancion> lista) {

        if(resp == true){
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


    
    /** 
     * @param lista
     */
    @Override
    public void escuchar(ArrayList<cancion> lista) {

        System.out.println("Escuchando: "+lista.get(posicion).getNombre()+lista.get(posicion).getAutor()+lista.get(posicion).getDuracion()+lista.get(posicion).getGenero()); 
        
    }

    
    /** 
     * @param destino
     * @return String
     */
    //metodo de modo_productividad

    @Override
    public String viajes(String destino) {

        Random ra = new Random();
        int distancia = ra.nextInt(150)+1; 
        int tiempo = ra.nextInt(20)+1; 
        String viaje="Para llegar a "+destino+" se tardara "+tiempo+" horas en recorrer "+distancia+" kilómetros.";
        
        return viaje;
    }

    
    /** 
     * @param vol
     */
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
            }
            else{
                volumen = volumen - 1;
                System.out.println("El volumen es de :"+volumen);
            }          
        }
        
        
    }

    
    /** 
     * @param resp
     */
    //metodo de modo_radio

    @Override
    public void cambiar(Boolean resp) {
        
       
        {
            String modulation;
            if (resp)
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


    
    /** 
     * @param emi
     */
    @Override
    public void cambiar_e(Boolean emi) {
        
        if(emi == true){
            emisora = emisora + 0.5;
        }
        else{
            if(emisora == 0){
                System.out.println("No se puede bajar más");
            }else{
                emisora = emisora - 0.5;
            }
        }  
        System.out.println("La emisora es "+emisora);

    }


    
    /** 
     * @param lista
     * @param emisora_number
     */
    @Override
    public void guardar(ArrayList<Double> lista, Double emisora_number) {
        if(lista.size()<50)
        {
            lista.add(emisora_number);
            System.out.println("Se ha guardado la emisora "+emisora_number);
        }
        else
        {
            System.out.println("No se pueden guardar más emisoras");
        }
        
    }


    
    /** 
     * @param lista
     */
    @Override
    public void cargar(ArrayList<Double> lista) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Estas son las emisoras guardadas:\n");
        for(int i = 0; i < lista.size(); i++)
        {
            System.out.println(i+""+lista.get(i));
        }
        System.out.println("Cual desea que sea la nueva emisora");
        int numero = keyboard.nextInt();
        if(numero < lista.size()){
            System.out.println("La nueva emisora es: " + lista.get(numero));
        }
        else{
            System.out.println("La emisora no está guardada");
        }           
    }

    
    /** 
     * @param es
     */
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