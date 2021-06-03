public class Factorial {

    public static void main(String[] args) {
        
       int resultado = factorial(12);
      
         

        System.out.printf("La suma es es: %d", resultado);
    }
        
    private static int factorial(int x)
    {
        int res=x;
        if (x!=1) {
            res = res*factorial(x-1);
        }
        return res;
    
    }
}

