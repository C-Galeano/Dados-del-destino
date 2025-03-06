import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int vida = 5;
        int puntos = 0;
       // int dado;
        int ronda = 1;

        Random random = new Random();
        int dado = random.nextInt(6) + 1;
        System.out.print(dado);

        System.out.println();
        System.out.print("1 - Pierdes 1 vida");
        System.out.println();
        System.out.print("6 - Ganas 3 Puntos");
        System.out.println();
        System.out.print("4 y 2 - Ganas 1 punto");
        System.out.println();
        System.out.print("3 y 5 - No pasa nada");
        System.out.println();

        while ( vida > 0 && puntos <= 10) {
            dado = random.nextInt(6) + 1;
            System.out.print("Ronda numero: "+ronda);
            System.out.println();
            System.out.print("El numero que salio es: "+dado);
            System.out.println();
            ;


            if (dado == 1) {
                vida--;
            }else if (dado == 6) {
                puntos += 3;
            }else if (dado == 2 || dado == 4) {
                puntos++;
            }
            System.out.println();
            System.out.print("Tienes " +vida+ " vidas");
            System.out.println();
            System.out.print("Tienes " +puntos+ " puntos");
            System.out.println();
            ronda++;
        }
        if (vida == 0){
            System.out.print("Te has quedado sin vidas. ");
        }else{
            System.out.println();
            System.out.print("Ganaste, tienes " + vida + " vidas y " + puntos + " puntos"  );
            System.out.println();
        }
        System.out.print("El numero de rondas final fue de: "+ronda);
        }


    }
