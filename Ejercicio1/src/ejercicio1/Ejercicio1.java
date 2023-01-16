package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        /*EJERCICIO 1*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca tres numeros:");
        Integer min = sc.nextInt();
        Integer num2 = sc.nextInt();
        Integer num3 = sc.nextInt();
        
        if(min > num2){
            min = num2;
        }
        if(min > num3){
            min = num3;
        }
        System.out.println(min + " es el menor numero.");
        
        /*EJERCICIO 2*/ 
        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine().toUpperCase();
        System.out.println("Introduzca la letra: ");
        
        Integer contador = 0;
        char letra = sc.next().toUpperCase().charAt(0);
        for (int i = frase.length()-1; i >= 0; i--) {
            char letra_pos = frase.charAt(i);
            if(letra_pos == letra){
                contador++;
            }
        }
        System.err.println("La letra aparece " + contador + " veces en la frase.");
        
        /*EJERCICIO 3*/
        System.out.println("Introduzca los numeros:");
        Double numero1 = sc.nextDouble();
        Double numero2 = sc.nextDouble();
        System.out.println("Indique + si quiere sumar los numeros o - si los quiere restar:");
        String signo = sc.next();
        switch (signo) {
            case "+":
                System.out.println(numero1 + numero2);
                break;
            case "-":
                System.out.println(numero1 - numero2);
                break;
            default:
                System.out.println("Simbolo incorrecto. La operación no se puede realizar.");
        }

        /*EJERCICIO 4*/ 
        String USUARIO = "Simona.Visan";
        String PASSWD = "pepe23";
        boolean login = false;
        Integer cont = 0;
        while(login || (cont < 3)){
            System.err.println("Introduzca el usuario: ");
            String user = sc.next().toString();
            System.err.println("Introduzca la contraseña: ");
            String pass = sc.next().toString();
            if(user.equals(USUARIO) && (pass.equals(PASSWD))){
                login = true;
                break;
            }
            else{
                cont++;
                System.out.println("Usuario o contraseña incorrectos.");
            }
        }
        if(!login){
            System.out.println("Limite de intentos alcanzados.");
        }

        /*EJERCICIO 5*/ 
        System.out.println("Introduzca una letra: ");
        char letra_ej5 = sc.next().charAt(0);
        switch (letra_ej5) {
            case 'a':
                System.out.println("7");
                break;
            case 'b':
                System.out.println("9");
                break;
            case 'c':
                System.out.println("101");
                break;
            default:
                System.out.println("Se ha equivocado de letra.");
        }

        /*EJERCICIO 6*/
        String lista[] = {"Suiza", "Francia", "Reino Unido", "Portugal", "España", "Alemania", "Italia"};
        String aux = "";
        
        for (int i = 0; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                if(lista[j].charAt(0) < lista[j-1].charAt(0)){
                    aux = lista[j];
                    lista[j] = lista[j-1];
                    lista[j-1] = aux;
                }
            }
        }
        
        for (String string : lista) {
            System.out.println(string);
        }
    }
    
}
