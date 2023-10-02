package ProcesadorDeText;

public class ReemplazoTextoPlugin implements Plugin{

    private String palabra;
    private String palabraOut;

    public ReemplazoTextoPlugin(String palabra, String palabraOut) {
        this.palabra = palabra;
        this.palabraOut = palabraOut;
    }

    @Override
    public void Ejecutar(String t){
        if(t.contains(palabraOut)){
            palabraOut = palabra;
        }
    }
}
