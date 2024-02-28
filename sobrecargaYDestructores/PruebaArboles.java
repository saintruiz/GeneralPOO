public class PruebaArboles
{
    public static void main(String[] args) {
        Arbol arbol1 = new Arbol(4);
        Arbol arbol2 = new Arbol("Roble");
        Arbol arbol3 = new Arbol();
        Arbol arbol4 = new Arbol(5,"Pino");
    }
}

class Arbol{
    public Arbol()
    {
        System.out.println("Arbol genérico");
    }
    public Arbol(int num)
    {
        System.out.println("Arbol de " + num + " metros");
    }
    public Arbol(String tipo)
    {
        System.out.println("Un arbol tipo " + tipo);
    }
    public Arbol(int num, String tipo)
    {
        System.out.println("Un " + tipo + " de " + num + " metros");
    }
}
