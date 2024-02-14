
class Cliente{
    String nombre;
    long cedula;
}

class CuentaBancaria{
    long numero;
    Cliente titular;
    static int saldo;
    public static int ingresar(int valor){
        int saldoActual= saldo+valor;
        return saldoActual;
    }
}

public class prueba{
    public static void main(String[] args){
        CuentaBancaria cuenta1;
        Cliente cliente1;

        cuenta1 =new CuentaBancaria();
        cliente1= new Cliente();

        ;
        cliente1.nombre="Santiago Ruiz";
        cliente1.cedula=1114058881;
        cuenta1.numero=6331532;
        cuenta1.titular=cliente1;

        int saldoCuenta1=cuenta1.ingresar(1000000);
        System.out.println(saldoCuenta1);

        

    }
}

