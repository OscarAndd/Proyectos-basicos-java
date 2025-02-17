package ProgramasRepaso;

import java.util.Random;
import java.util.Scanner;

public class adivinaPalabra {
    public static void main(String[] args) {
        var palabras= new String[]{"medalla", "manteca", "almohada", "computador", "helicoptero"};
        var rand=new Random();
        var entrada= new Scanner(System.in);

        var palabraAdivinar=palabras[rand.nextInt(0,5)];
        int minimoLetras=(int)(Math.floor(palabraAdivinar.length()*0.6));
        int [] espaciosVacio=new int[minimoLetras];
        int indx=0;
        var flagYaExiste=true;
        var reemplazar = new StringBuilder(palabraAdivinar);


        for (int i = 0; i< minimoLetras ; i++) {
            indx=rand.nextInt(0, palabraAdivinar.length());
            flagYaExiste=true;
            while(flagYaExiste){
            for(int j = 0; j <espaciosVacio.length ; j++) {
                if(espaciosVacio[j]== indx){
                    flagYaExiste=true;
                    break;
                }
                else{flagYaExiste=false;}
            }
            if(flagYaExiste){
                indx=rand.nextInt(0, palabraAdivinar.length());
            }
            else{break;}
            }
            espaciosVacio[i]=indx;
            reemplazar.setCharAt(indx,'_');
        }
        var numIntentos=8;
        var ganarOpc1=0;
        var palabraAdivinarAux= new StringBuilder(palabraAdivinar);
        var flagEncuentra=true;
        for(int i=numIntentos;i>=1;i--){
           flagEncuentra=true;

            System.out.println("*****************************************************");
            System.out.println("numero de intentos: " + i);
            System.out.println("Ingrese una letra o la palabra si la sabe");
            System.out.println(reemplazar);

            var datoUsuario = entrada.nextLine();
            if(datoUsuario.length()<2 && !datoUsuario.isEmpty()){
                for (int p = 0; p < minimoLetras; p++) {
                    if(datoUsuario.charAt(0)==palabraAdivinarAux.charAt(espaciosVacio[p])){
                        reemplazar.setCharAt(espaciosVacio[p],datoUsuario.charAt(0));
                        ganarOpc1++;
                        i++;
                        flagEncuentra=false;
                        palabraAdivinarAux.setCharAt(espaciosVacio[p],' ');
                        if(ganarOpc1== espaciosVacio.length){
                            System.out.println("FELICITACIONES");
                            break;
                        }
                    }
                }
                if(flagEncuentra==true){
                    System.out.println("Error, sigue intentando");
                }
            }
            else {
            if(datoUsuario.equals(palabraAdivinar)){
                    System.out.println("FELICITACIONES HAZ GANADO!");
                    flagEncuentra=false;
                    break;
            }
            else { System.out.println("Error, sigue intentando");}
            }

            if(ganarOpc1==espaciosVacio.length){
                System.out.println("HAZ HANADO");
                break;
            }
        }
        if(flagEncuentra==true){
            System.out.println("HAZ ACABADO CON LOS INTENTOS, HAZ PERDIDO");
        }

    }
}
