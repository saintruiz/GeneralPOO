public class ejemplo1
{
    private final int num;

    public ejemplo1(int num)
    {
        this.num=num; //Se le asigna el valor final al atributo (num)
    }

    public void cambioFinal(int num)
    {
        //this.num=num; 
    }

    public int getNum()
    {
        return this.num;
    }

    public void setNum(int num)
    {
        //this.num=num;
    }
}
