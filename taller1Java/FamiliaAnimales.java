package taller1Java;

public class FamiliaAnimales {  
    public static void main(String args[]) { 
    Animal animal1 = new Animal(); //Se crea el primer animal
    Animal.totalAnimales++; //Se aumenta la cantidad de animales (+1)
    Animal animal2 = new Animal(); //Se crea el segundo animal
    Animal.totalAnimales++; //Se aumenta la cantidad de animales (+1)
    animal1.nombre = "Cebra"; //Se le da valor al atributo nombre (objeto 1)
    animal1.genero = "F";  //Se le da valor al atributo género (objeto 1)
    animal2.nombre = "Caballo"; //Se le da valor al atributo nombre (objeto 2)
    animal2.peso = 98.0; //Se le da valor al atributo peso (objeto 2)

    System.out.println(animal1.nombre + " se va a casar con " + animal2.nombre); 

    animal1.setPareja(animal2); 
    animal2.setPareja(animal1); //Esta asignación de valor de pareja para el objeto 2 está de más

    Familia familia = animal1.procrear("Cebrallo"); //Se crea el objeto Familia llamando al método procrear del objeto 1 
    if (familia != null) { 
        familia.imprimir(); 
        System.out.println(familia.hijo); 
    } else { 
        System.out.println("No se pudo formar familia"); 
    } 
    System.out.println("Total de animales: " + Animal.totalAnimales); 
    Animal.morir(animal2); //El objeto 2 no se destruyó pero el atributo "totalAnimales" disminuyó su cantidad
    System.out.println("Nuevo total de animales: " + Animal.totalAnimales); 
} 
}
