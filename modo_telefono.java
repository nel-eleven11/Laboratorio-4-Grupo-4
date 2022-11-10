/*
 * authores: Nelson  García, Oscar Fuentes, Jose Joaquín Campos
 * 
 * fecha: 8-11-2022
 * interfaz de telefono
 */
import java.util.ArrayList;

public interface modo_telefono {
    public void conexion(boolean coneccion);
    public void contactos(ArrayList<contacto> lista);
    public void llamar(ArrayList<contacto> lista);
    public void finalizar();
    public void audio(Boolean tel);

}
