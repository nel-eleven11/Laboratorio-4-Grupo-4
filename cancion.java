public class cancion {

    private String nombre;
    private String duracion;
    private String autor;
    private String genero;

    public cancion(){
        nombre = "";
        duracion = "";
        autor = "";
        genero = "";
    }

    public cancion(String nombre, String duracion, String autor, String genero){
        this.nombre = nombre;
        this.duracion = duracion;
        this.autor = autor;
        this.genero = genero;
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
    public String getDuracion(){
        return duracion;
    }

    
    /** 
     * @return String
     */
    public String getAutor(){
        return autor;
    }

    
    /** 
     * @return String
     */
    public String getGenero(){
        return genero;
    }

    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    
    /** 
     * @param duracion
     */
    public void setDuracion(String duracion){
        this.duracion = duracion;
    }

    
    /** 
     * @param autor
     */
    public void setAutor(String autor){
        this.autor = autor;
    }

    
    /** 
     * @param genero
     */
    public void setGenero(String genero){
        this.genero = genero;
    }

    
    /** 
     * @return String
     */
    public String toString(){
        return "Nombre: " + nombre + " Duracion: " + duracion + " Autor: " + autor + " Genero: " + genero;
    }

    
    
    
}
