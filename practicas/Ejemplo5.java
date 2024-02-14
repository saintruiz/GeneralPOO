public class Ejemplo5 {
    public static int test(int val, int val2) {
    int result = 0;
    if(val > val2)
    result = +1;
    else if(val < val2)
    result = -1;
    else
    result = 0;
    return result;
    }
    public static void main(String[] args) {
    System.out.println(test(10, 5));
    System.out.println(test(5, 10)); 
    System.out.println(test(5, 5));
    }
}