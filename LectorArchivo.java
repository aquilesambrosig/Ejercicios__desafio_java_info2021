import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectorArchivo {

    public static void main(String[] args) throws IOException {
        String path = "D:/Users/Aquiles/Documents/Info etapa 3/Java/Ejercicios/Clase 29-05/alumnos.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
           
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
                
            }


        }
    }
}