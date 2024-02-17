package taller1Java;

public class Animal { 
    //Declaramos los atributos principales de los objetos
    String nombre; 
    String genero = "M"; 
    double peso; 
    Animal pareja; 
    static int totalAnimales; //Este atributo será de clase ya que el total de animales depende de todos los objetos creados en general

    void setPareja(Animal pareja) { 
        this.pareja = pareja; 
        //Método de objeto
        //Se ingresa como argumento un objeto, y ese objeto será el valor de "pareja"
    } 

    Animal tenerHijo (String nombre) { 
        //Se declara un método de objeto que devolverá un objeto (animal)
        Animal hijo = new Animal(); //Se crea un nuevo objeto 
        totalAnimales++; 
        hijo.nombre = nombre; 
        hijo.peso = 1; 
        double random = Math.random(); 
        if (random < 0.5) 
            hijo.genero = "F"; 
        else 
            hijo.genero = "M"; 
        return hijo; 
    } 

    Familia procrear(String nombreHijo) { 
        //Método que devuelve un objeto de tipo pareja
        if (pareja == null) { 
            System.out.println(this.nombre + " no tiene pareja"); 
            return null; 
        } 
        if (pareja.genero.equals(genero)) { 
            System.out.println(nombre + " y " + pareja.nombre + " son del mismo genero"); 
            return null; 
        } 
        System.out.println(.nombre + " y " + pareja.nombre + " van a tener un hijo"); 
        Familia f = new Familia(); //Se crea el objeto familia

        if (this.genero.equals("M")) { 
        f.mama = pareja; 
        f.papa = this; 
        } else { 
        f.mama = this; 
        f.papa = this.pareja; 
        } 
        Animal hijo = f.mama.tenerHijo(nombreHijo); 
        f.hijo = hijo; 
        System.out.println(hijo.nombre + " ha llegado al mundo"); 
        return f; //Retorna el objeto familia
    } 

    static void morir (Animal animal) { 
            //Se declara un método de clase que va a disminuir la cantidad de animales
        System.out.println(animal.nombre + " ha muerto"); 
        totalAnimales--; 
    } 

    public String toString() { 
        return "Me llamo " + nombre + " y peso " + peso; 
    } 
}
