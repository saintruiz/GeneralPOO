class ejercicio8
{
    public static void main(String[] args) 
    {
        int[] valores1= {1,48,5,3,29,62};
        int[] valores2= {45,1,22};
        System.out.println(valores2[2]);
        metodo1(valores1[4],valores2);
        metodo1(valores2[2], valores2);
        metodo2(valores2);
        valores1=metodo3(valores2);
        System.out.println(valores1[0]);
        for(int i=1; i<valores2.length;i++)
        System.out.println("" + valores1[i]);
    }
    public static void metodo1(byte Numero, int[] lista)
    {
        int numero=0;
        lista[2]=numero+=10;
    }
    public static void metodo1(float Numero, int[] lista)
    {
        float numero=0f;
        lista[2]=(int)numero+(int)5f;
    }
    public static void metodo2(int[] lista)
    {
        lista[1]=lista[2];
    }
    public static int[] metodo3 (int[] lista)
    {
        for(int i=0; i<lista.length; i++)
            lista[i]=lista[i]+i;
        return lista;
    }
}   
