class CuentaBancaria: 
    def__init__(self,numero,titular,saldo): 
        self.numero=numero 
        self.titular=titular 
        self.saldo =saldo 
        def ingresar(self,cantidad): 
            self.saldo =self.saldo +cantidad 
        def retirar(self,cantidad): 
            if cantidad>=self.saldo :
                print("saldoinsuficiente") 
            else: 
                self.saldo=self.saldo-cantidad

if __name__ == "__main__":
    pass