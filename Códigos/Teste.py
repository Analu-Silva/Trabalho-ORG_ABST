#Intanciando a classe Moto
from Moto import Moto
from Códigos.Veiculo import Veiculo


falcon = Moto("Honda", "Falcon NX4", "abc", 2005, 400)

# Vai imprimir o RETORNO do método "__str__()"
print(falcon.__str__())

# Intanciando a classe Veiculo
cerato = Veiculo("Kia", "Cerato", "IRL", 2011)

print(cerato.__str__())