//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String nombre = "Oscar Andres Alvarez";
        String empresa= "Digital Solutions";
        String dominio= "com.co";

        var nombreNormalizado=nombre.replace(" ",".").toLowerCase();
        nombreNormalizado=nombreNormalizado.concat("@");
        var empresalower=empresa.toLowerCase();
        var empresa1 = empresalower.substring(0,7);
        var empresa2 = empresalower.substring(8);
        var empresaNormalizado=empresa1+empresa2;
        empresaNormalizado=empresaNormalizado.concat(".");

        var correo=nombreNormalizado+empresaNormalizado+dominio;

        System.out.println("el correo es:"+correo);

    }
}