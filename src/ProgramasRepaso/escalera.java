package ProgramasRepaso;

import java.util.Scanner;

public class escalera {

    public static void main(String[] args) {
        var entrada= new Scanner(System.in);
        System.out.println("Ingrese el numero de escalones");
        var escalones=entrada.nextInt();
        var escalonesAux=escalones;
        if(escalones>0){
            for(int j=0;j<escalones;j++){
                var i=0;
                while(i<=escalonesAux-2){
                    System.out.print("  ");
                    i++;
                }
                if(escalones!=escalonesAux) {
                    System.out.print("_|");
                }
                else{System.out.print("_");}
                escalonesAux--;
            System.out.println();
            }
        }


        else if (escalones<0) {
            escalonesAux=0;
            escalones=escalones*-1;
            System.out.println("_");
            for(int i=0;i<escalones;i++){
                for (int j =0 ; j <escalonesAux; j++) {
                    System.out.print("  ");
                }
                escalonesAux++;
                System.out.println("|_");
            }
        }
        else {
            System.out.println("__");
        }
    }
}
