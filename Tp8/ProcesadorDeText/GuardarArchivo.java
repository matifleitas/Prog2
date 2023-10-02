package ProcesadorDeText;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GuardarArchivo implements Plugin{
    private String textoAGuardar;

    public GuardarArchivo(){
        this.textoAGuardar="-";
    }
    @Override
    public void Ejecutar(String t) {
        String textoAGuardar = "Hello File!";
        String path = "C:\\Users\\marce\\Downloads\\archivoDestino.txt";
        try {
            Files.write(Paths.get(path), textoAGuardar.getBytes());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
