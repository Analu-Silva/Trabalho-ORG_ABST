from Veiculo import Veiculo
class Caminhão(Veiculo):
    def __init__(self, marca, modelo, placa, ano, n_portas, capacidade):
        super().__init__(marca, modelo, placa, ano)
        self.__n_portas = n_portas
        self.__capacidade = capacidade
    def __str__(self):
        ret = super().__str__()
        return f'''{ret}
    - Num. Portas: {self.__n_portas}
    - Capacidade: {self.__capacidade}'''
    