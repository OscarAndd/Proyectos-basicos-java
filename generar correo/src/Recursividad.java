public class Recursividad {
    static void imprimirNumeros(int a){
        if (a ==1){
            System.out.print(a);
        }
        else{
            imprimirNumeros(a-1);
            System.out.print(a);

        }
    }

    public static void main(String[] args) {
        imprimirNumeros(5);
    }
}
