import java.util.Scanner;//Se importa la clase Scanner para permitir la entrada del usuario.
public class MainResta {//Se declara la clase MainResta que contiene el método main.
    public static void main(String[] args) {//ste es el método principal del programa. Es el punto de entrada y salida de la ejecución del código.
        Resta resta1 = new Resta();//Se crea un nuevo objeto de la clase Resta.
        int a,e;//Se declaran dos variables enteras a y e, que se usan para almacenar los números ingresados.
        
        Scanner op = new Scanner(System.in);//Se crea un nuevo objeto Scanner llamado op, que se utiliza para leer la entrada del usuario desde la consola.
        System.out.print("Ingresa el primer numero: ");//El usuario ingresa un número, guardado como entero en 'a' con 'nextInt()' de 'Scanner'.
        a = op.nextInt();
        System.out.print("Ingresa el segundo numero: ");//Se solicita al usuario que ingrese otro número, almacenándolo en 'e' con 'nextInt()' de 'Scanner'.
        e = op.nextInt();

        
        resta1.setNum1(a);//Los números ingresados por el usuario se asignan al objeto resta1 utilizando los métodos setNum1() y setNum2().
        resta1.setNum2(e);

        resta1.MostrarResultado();//Se muestra el resultado de la operación de resta.

    }
}