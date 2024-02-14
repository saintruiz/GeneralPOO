public class Ejemplo3 {
 public static void main(String[] args) {
 String saludo = "Hola";
 String saludo2 ="hola";
 int n = 5;
 prt(saludo.substring(0,2));
 prt(saludo +" " + n);
 prt("saludo == saludo2 "+ saludo.equals(saludo2));
 }
 //se declara una función prt() para ahorrar escritura
 static void prt(String s) {
 System.out.println(s);
 }
} 