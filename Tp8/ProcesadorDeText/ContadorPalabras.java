package ProcesadorDeText;

public class ContadorPalabras implements Plugin{

    private int cont;

    public ContadorPalabras(){
        this.cont=0;
    }
    @Override
    public void Ejecutar(String t) {
        String[] palabras = t.split( "\\s+");
        this.cont = palabras.length;
    }
}
