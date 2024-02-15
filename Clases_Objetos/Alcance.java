public class Alcance{
    int x= 1;
    int y=2;

    int metodo1(int x){
        x=5;
        return x*x*x;
    }

    void metodo2(){
        --x;
    }

    void metodo3(){
        int x=5;
        this.x= x* this.x;
    }

    void metodo4(){
        int x= 6;
        metodo3();
        System.out.println("x= " + x);
        System.out.println("x= " + this.x);

        metodo2();
        x=metodo1(this.x);
        System.out.println("x= " + x);
        System.out.println("x= " + this.x);
        
        this.x=metodo1(x);
        System.out.println("x= " + x);
        System.out.println("x= " + this.x);
    }
    public static void main(String[] args) {
        Alcance alc1= new Alcance();
        alc1.metodo4();
    }

}