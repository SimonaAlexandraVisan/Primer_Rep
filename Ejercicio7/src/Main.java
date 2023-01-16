import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*EJERCICIO 7*/
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la hora:");
        Integer hora = sc.nextInt();
        System.out.println("Introduzca los minutos:");
        Integer minutos = sc.nextInt();
        System.out.println("Introduzca los segundos:");
        Integer segundos = sc.nextInt();
        if((0<= hora) && (hora <= 23) && (minutos >= 0) && (minutos <= 59) && (segundos >= 0) && (segundos <= 59)){
            System.out.println("La hora es valida.");
        }
        else{
            System.out.println("La hora introducida no es valida.");
        }
        */

        /*EJERCICIO 8*/
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número del mes:");
        Integer mes = sc.nextInt();
        switch (mes){
        case 1:
            System.out.println("Enero tiene 31 días.");
            break;
        case 2:
            System.out.println("Febrero tiene 28 días.");
            break;
        case 3:
            System.out.println("Marzo tiene 31 días.");
            break;
        case 4:
            System.out.println("Abril tiene 30 dáis.");
            break;
        case 5:
            System.out.println("Mayo tiene 31 días");
            break;
        case 6:
            System.out.println("Junio tiene 30 días.");
            break;
        case 7:
            System.out.println("Julio tiene 31 días.");
            break;
        case 8:
            System.out.println("Agosto tiene 31 días.");
            break;
        case 9:
            System.out.println("Septiembre tiene 30 días.");
            break;
        case 10:
            System.out.println("Octure tiene 31 días.");
            break;
        case 11:
            System.out.println("Noviembre tiene 30 días.");
            break;
        case 12:
            System.out.println("Diciembre tiene 31 días");
            break;
        default:
                System.out.println("No existe el mes " + mes + ".");
        }
         */

        /*EJERCICIO 9*/
        /*
        final int NUM_CLOSE = -25;
        ArrayList<Integer> lista_zero = new ArrayList<>();
        ArrayList<Integer> lista_neg = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca numeros:");
        Integer num = sc.nextInt();
        while(num != NUM_CLOSE){
            if(num == 0){
                lista_zero.add(num);
            }
            if(num < 0){
                lista_neg.add(num);
            }
            num = sc.nextInt();
        }
        System.out.println("Se han introducido " + lista_zero.size() + " 0s y "
                + lista_neg.size() + " números negativos, sin contar el -25.");

         */

        /*EJERCICIO 10*/
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número a invertir:");
        Integer num = sc.nextInt();
        if((num >= 0) && (num <= 9)){
            System.out.println("N = " + num);
        }
        else{
            String num_String = num.toString();
            String aux = "";
            for (int i = num_String.length()-1; i >= 0; i--){
                aux += num_String.charAt(i);
            }
            System.out.println("N = " + aux);
        }
        
         */
    }
}