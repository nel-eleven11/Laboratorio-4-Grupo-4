public class contacto {

    private String nombre;
    private String telefono;

    public contacto(){
        nombre = "";
        telefono = "";
    }

    public contacto(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }

    
    /** 
     * @return String
     */
    public String getNombre(){
        return nombre;
    }

    
    /** 
     * @return String
     */
    public String getTelefono(){
        return telefono;
    }

    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    
    /** 
     * @param telefono
     */
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    
    /** 
     * @return String
     */
    public String toString(){
        return "Nombre: " + nombre + " Telefono: " + telefono;
    }
    
}
