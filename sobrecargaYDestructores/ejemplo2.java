public class ejemplo2
{
    public static void main(String[] args) {
        rectangulo r1=new rectangulo();
        System.err.println(r1.toString());
        rectangulo r2=new rectangulo(5, 6);
        System.err.println(r2.toString());
        rectangulo r3=new rectangulo(1, 2, 3, 4);
        System.err.println(r3.toString());
    }
}

class rectangulo
{
    int x,y;
    int ancho,alto;

    rectangulo() //Se declara un constructor dentro del cuál se llama al constructor principal
    {
        this(0, 0, 0, 0); //Se inicializan los valores en 0
    }
    rectangulo(int ancho, int alto) //Se declara un constructor dentro del cual se llama a un constructor principal
    {
        this(0, 0, ancho, alto); //x=0, y=0, ancho=ancho, alto=alto
    }
    rectangulo(int x, int y, int ancho, int alto)//Constructor principal
    {
        this.x=x;
        this.y=y;
        this.ancho=ancho;
        this.alto=alto;
    }
    public String toString()
    {
        return "x= " + this.x + "y= " + this.y + "Ancho= " + this.ancho + "Alto= " + this.alto ;
    }
}