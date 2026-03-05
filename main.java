
import java.util.Scanner;

public class main{

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("haremos los resultados financieros :");
    
    persona p = new persona("jorge", 1000, 200, 300, 500);
        p.calcular();

    persona2 p2 = new persona2("erick", 1000, 200, 300, 400);
        p2.calcular();

    persona p4 = new persona("adriana", 1000, 200, 300, 500);
        p4.calcular();
        

    }
    
}
        
        