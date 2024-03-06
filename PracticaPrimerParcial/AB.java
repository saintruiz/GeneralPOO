class A{
    public A(){} //Constructor que no haca nada
    public A(int i){ System.out.println(i);} //Constructor que imprime en pantalla el valor que se le pase por parámetro
}

class B{
    static A s1 = new A(1);
    A a = new A(2);
    public static void main (String[] args){
        B b = new B();
        A a = new A(3);
    }
    static A s2 = new A(4);
}