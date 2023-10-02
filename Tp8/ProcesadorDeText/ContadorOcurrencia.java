package ProcesadorDeText;

public class ContadorOcurrencia implements Plugin{
    String palabra;
    private int cantPalabra;
    public ContadorOcurrencia(String palabra) {
        this.palabra = palabra;
        this.cantPalabra = 0;
    }

    @Override
    public void Ejecutar(String t) {
        String[] palabras = t.split( "\\s+");
        for(int i=0; i<palabras.length; i++){
            if(palabras[i].contains(palabra)){
                cantPalabra++;
            }
        }
        System.out.println("La palabra se repite: "+cantPalabra);
    }
}
