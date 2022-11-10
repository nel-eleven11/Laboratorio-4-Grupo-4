
/*
 * authores: Nelson  García, Oscar Fuentes, Jose Joaquín Campos
 * 
 * fecha: 8-11-2022
 * interfaz de modo radio
 
 */
import java.util.ArrayList;


public interface modo_radio {
    public void cambiar(Boolean cam);
    public void cambiar_e(Boolean emisora);
    public void guardar(ArrayList<Double> lista, Double numero_e);
    public void cargar(ArrayList<Double> lista);

}