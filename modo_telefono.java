import java.util.ArrayList;

public interface modo_telefono {
    public void conexion(boolean conection);
    public void contactos(ArrayList<contacto> lista);
    public void llamar(ArrayList<contacto> lista);
    public void finalizar();
    public void audio(Boolean flag);

}
