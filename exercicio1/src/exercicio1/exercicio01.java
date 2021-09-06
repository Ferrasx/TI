package exercicio1;
import java.util.Scanner;

public class exercicio01 {



        public static Scanner sc = new Scanner(System.in);

        public static void main (String args[]) {

            int numero1, numero2,somatorio;

            System.out.println("Entre com numero 1:");
                numero1 = sc.nextInt();

            System.out.println("Entre com numero 2");
            numero2 = sc.nextInt();


            somatorio = numero1 + numero2;

            System.out.println("	:"+somatorio);




    }


}