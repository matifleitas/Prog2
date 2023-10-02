package ProcesadorDeText;

public class EliminarPalabraPlugin implements Plugin{
    private String palabraAEliminar;

    public EliminarPalabraPlugin(String palabraAEliminar) {
        this.palabraAEliminar = palabraAEliminar;
    }
    @Override
    public void Ejecutar(String t) {
        if(t.toLowerCase().contains(palabraAEliminar.toLowerCase())){
            t.replace(palabraAEliminar, " ");
        }
    }
}
