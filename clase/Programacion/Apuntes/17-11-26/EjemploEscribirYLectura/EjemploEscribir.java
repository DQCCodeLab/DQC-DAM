import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.file.Path;

class EjemploEscribir {
    public static void main(String[] args) {
       // Para escribir texto en un archivo
       try {
            String texto = "Hola mundo";
            String nombreArchivo = "ejemplo.txt";
            Files.write(Path.of(nombreArchivo), texto.getBytes("utf-8"), StandardOpenOption.CREATE);
        } catch(UnsupportedEncodingException e) {
            e.printStackTrace();
       } catch(IOException e) {
            e.printStackTrace();
       }
    }
}

