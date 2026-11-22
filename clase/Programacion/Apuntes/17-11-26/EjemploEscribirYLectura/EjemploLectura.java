import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.file.Path;

class EjemploLectura {
    public static void main(String[] args) {
        // Para leer un archivo
        try { 
            String nombreArchivo = "ejemplo.txt";
            String leido = new String(Files.readAllBytes(Path.of(nombreArchivo)), "utf-8");
            System.out.println(leido);
        } catch(UnsupportedEncodingException e) {
            e.printStackTrace();
       } catch(IOException e) {
            e.printStackTrace();
       }
    }
}

