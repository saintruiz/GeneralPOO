public class ejemplo1_
{
    public static void main(String[] args) {
        ejemplo1 obj = new ejemplo1(4);
        System.out.println(obj.getNum());
        obj.cambioFinal(5);
        System.out.println(obj.getNum());
        obj.setNum(0);
        System.out.println(obj.getNum());
    }

}
