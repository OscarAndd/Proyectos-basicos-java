package ProgramasRepaso;

import java.util.Scanner;

public class vocalMasRepetida {

    public static void main(String[] args) {
        var entrada=new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto");
        var textoUsuario=entrada.nextLine();
        var lenght=textoUsuario.length();
        var character=' ';
        int a=0,e=0,i=0,o=0,u=0;
        for(int j=0;j<lenght;j++){
            character=textoUsuario.charAt(j);
            if(character=='a' || character=='A'){
                a++;
            }
            else if(character=='e' || character=='E'){
                e++;
            }
            else if(character=='i' || character=='I'){
                i++;
            }
            else if(character=='o' || character=='O'){
                o++;
            }
            else if(character=='u' || character=='U'){
                u++;
            }
        }
        int [] numVocales={a,e,i,o,u};
        char [] vocales={'a','e','i','o','u'};
        var ordenar=numVocales[0];
        var masRepetido='a';
        for(int l=0;l<5;l++){
            if (numVocales[l]>ordenar){
                ordenar=numVocales[l];
                masRepetido=vocales[l];
            }
        }
        System.out.println("la vocal mas repetida es: "+masRepetido);

    }

}
