package ProgramasRepaso;

public class fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<40;i++){
           c=a+b;
           b=a;
           a=c;
           System.out.println(c);
        }
    }
}
/*A   B   C
  0   1   1
  1   0   1
  1   1   2
  2   1   3
  3   2   5  */