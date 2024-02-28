public class ejemplo3
{
    public static void main(String[] args) 
    {
        A a=new A();
        byte b= 3;
        long l=3;
        double d=3;
        a.f(l); //Expected: "tipo float"
        a.f(b); //Expected: "tipo int"
        a.f(d); //Expected error
    }
}

class A
{
    void f(int n)
    {
        System.out.println("tipo int");
    }
    void f(float x)
    {
        System.out.println("tipo float");
    }
}