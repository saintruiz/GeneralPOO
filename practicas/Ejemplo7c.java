public class Ejemplo7c {
    public static void main(String[] args) {
    int array[] = new int[10];

    int suma = 0;
    int cont = 0;

    //con este bucle damos valores a los elementos del array
    for (int i = 0; i < array.length; i++) {
    array[i]= 2*i;
    }
    for (int e : array){ //para cada elemento del array
    suma = suma + e;
    }
    System.out.println(suma);
    }
   
   }