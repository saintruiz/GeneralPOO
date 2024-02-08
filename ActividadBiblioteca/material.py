class material():
    def __init__(self, titulo , anio ):
        self.__titulo=titulo
        self.__anio=anio

class revista(material):
    def __init__(self, titulo , anio , isnn , volumen , mes ):
        super().__init__(titulo , anio )
        self.__isnn=isnn
        self.__volumen=volumen
        self.__mes=mes
 
class libro(material):
    def __init__(self, titulo , anio, isbn, tipo, editorial):
        super().__init__(titulo, anio)
        self.__isbn=isbn
        self.__tipo=tipo
        self.__editorial=editorial

