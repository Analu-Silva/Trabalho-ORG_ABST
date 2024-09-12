from Veiculo import Veiculo

class Moto(Veiculo):
    def __init__(self, marca, modelo, placa, ano, cilindradas):
        super().__init__(marca, modelo, placa, ano)
        self.__cilindradas = cilindradas
    def __str__(self):
        # Invoco o método __str__() da SUPERCLASSE (Veiculo)
        # Armazeno o retorno na varial "retorno"
        retorno = super().__str__()
        # "retorno" com as "__cilindradas"
        return f'''{retorno}
- Cilindradas: {self.__cilindradas}'''

