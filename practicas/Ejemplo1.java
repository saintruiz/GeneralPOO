public class Ejemplo1{
    public static void main(String[] args) {
        int i = 9,k;
        //Declaramos dos variables de tipo entero(i=9, k=0)
        float j = 47.9F;
        System.out.println("i: " + i + " j: " +j);


        k = (int)j; //empleo de un cast
        System.out.println("j: " + j + " : " +k);

        j = k; //no necesita cast
        System.out.println("j: " + j + " : " +k);

        float m = 2.3F;
        //float m = 2.3; daría error al compilar.
        System.out.println("m: "+m); 
    }
}