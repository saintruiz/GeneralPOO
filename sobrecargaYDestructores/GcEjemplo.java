public class GcEjemplo
{
    public static void main(String[] args) 
    {
        for (int i=0; i<11; i++)
        {
            miClase Clase = new miClase(i);
            System.out.println("Mi clase creada, c= " + Clase.getC());
            System.out.println(Clase);
            System.gc();
        }
    }
}

class miClase
{
    private final int c;
    public miClase(int c)
    {
        this.c=c;
    }
    public int getC()
    {
        return c;
    }
   
}