import java.util.Scanner; //Libreria
public class MainResta {
    public static void main(String[] args) {
        Resta resta1 = new Resta();
        int a,e;
        
        // declarar variables
        Scanner op = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        a = op.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        e = op.nextInt();

        // Asignar datos
        resta1.num1 = a;
        resta1.num2 = e;

        resta1.MostrarResultado();

    }
}