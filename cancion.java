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

    public String getNombre(){
        return nombre;
    }

    public String getDuracion(){
        return duracion;
    }

    public String getAutor(){
        return autor;
    }

    public String getGenero(){
        return genero;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDuracion(String duracion){
        this.duracion = duracion;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String toString(){
        return "Nombre: " + nombre + " Duracion: " + duracion + " Autor: " + autor + " Genero: " + genero;
    }

    
    
    
}
