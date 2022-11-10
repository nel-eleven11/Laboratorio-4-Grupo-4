/*
 * authores: Nelson  García, Oscar Fuentes, Jose Joaquín Campos
 * 
 * fecha: 8-11-2022
 * interfaz de reproduccion
 */
 

import java.util.ArrayList;
public interface modo_reproduccion {
    public void seleccionar(ArrayList<cancion> lista);
    public void cambiar_c(Boolean c,ArrayList<cancion> lista);
    public void escuchar(ArrayList<cancion> lista);
}
