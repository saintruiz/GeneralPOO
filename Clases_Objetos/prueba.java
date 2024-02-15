
class Cliente{
    String nombre;
    long cedula;
}
//La clase Cliente o tiene ni métodos de clase ni de objetos

class CuentaBancaria{
    long numero;
    Cliente titular;
    double saldo;
    public void ingresar(double valor){
        saldo+= valor;
        System.out.println("Se ha ingresado valor");
    }

    public void retirar(double valor){
        if (valor>saldo){
            System.out.println("Saldo insuficiente");
        }else{
            saldo-=valor;
            System.out.println("El dinero ha sido retirado");
        }
    }
    //El método ingresar se refiere a un método de la clase, de caracter público al cuál se puede acceder desde fuera de la clase
    //Y el cual retorna un entero
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

        cuenta1.ingresar(1000);

        

    }
}

