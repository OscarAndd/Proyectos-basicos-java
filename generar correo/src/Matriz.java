import java.util.Scanner;
//SUMAR LAS DIAGONALES DE UNA MATRIZ
public class Matriz {
    public static void main(String[] args) {
        //int[][] matriz={{1,2,3,4},{2,3,41,2}};
        int[][] matriz=new int[3][3];
        var entrada=new Scanner(System.in);
        var suma=0;
        for(int fil=0;fil<3;fil++){
            for(int col=0;col<3;col++){
                System.out.printf("Ingrese el valor para la fila %d columna %d",fil,col);
                matriz[fil][col]=entrada.nextInt();
            }
        }

        for(int fil=0;fil<3;fil++){
            for(int col=0;col<3;col++){
               if(fil==col){
                   suma=suma+matriz[fil][col];
               }
            }
        }
        System.out.printf("la suma es:%d",suma);

    }
}
