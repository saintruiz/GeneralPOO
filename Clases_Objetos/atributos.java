class cuentaCorriente{
    private long numero; //Atributo de objeto
    public final static double interes=2.0; //Atributo de clase (Estaticos)

    }

public class atributos{
    public static void main(String[] args){
        cuentaCorriente nuevaCuenta= new cuentaCorriente();
        System.out.println(nuevaCuenta.interes);
    }
}

//Retorna=2.0