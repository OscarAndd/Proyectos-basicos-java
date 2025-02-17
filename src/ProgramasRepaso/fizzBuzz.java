package ProgramasRepaso;
//MULTIPLOS DE 3 FIZZ, MULTIPLOS DE 5 BUZZ Y DE LOS DOS FIZZBUZZ
public class fizzBuzz {
    public static void main(String[] args) {
        var i=1;
        while(i<=100){
            if(i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
            }
            else if(i%3==0){
                System.out.println("fizz");
            } else if (i%5==0) {
                System.out.println("buzz");
            }
            else{
                System.out.println(i);
            }
        i++;
        }
    }
}
