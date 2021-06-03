import java.io.*;
import java.util.*;

public class ListaEmpleados {
    public static void main(String[] args) {
        String path = "D:/Users/Aquiles/Documents/Info etapa 3/Java/Ejercicios/Clase 29-05/empleadxs.txt";
    
        List<Empleado> lista = new ArrayList<>();
        lista.add(new Empleado("Nombre", "Apellido", 40178924, 8, 340));
        lista.add(new Empleado("Aquiles", "Asdefg", 13574481, 4, 332));
        lista.add(new Empleado("Giovanni", "LoCelso", 35125823, 5, 310));
        lista.add(new Empleado("Lionel", "Messi", 4025325, 6, 456));
        lista.add(new Empleado("Lionel", "Scaloni", 41235678, 8, 440)); 

        try {
            EscribirArchivo(path, lista);
        } catch (IOException e) {
            
            e.printStackTrace();
        }

    
    }

    public static void EscribirArchivo(String path, List<Empleado> lista) throws IOException {
        BufferedWriter fw = new BufferedWriter(new FileWriter(path));
        for (Empleado empleado : lista) {
            fw.write("Apellido: " + empleado.apellido +" -  DNI: "+empleado.dni +"  - HorasTrabajadas: " + empleado.horasTrabajadas);
            fw.write("\n");
            
        }
        fw.close();
                
        }

        
    }



