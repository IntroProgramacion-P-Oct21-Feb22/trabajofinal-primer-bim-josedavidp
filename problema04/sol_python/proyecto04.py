valor_a = int(input("Valor 1: "))
valor_b = int(input("Valor 2: "))
valor_c = int(input("Valor 3: "))
if valor_a == valor_b or valor_a == valor_c or valor_b == valor_c:
    print("Ha ingresado valores repetidos en 2 o más ocasiones")
else:
    valormax = max(valor_a, valor_b, valor_c)
    print("El número mayor entre los valores %d, %d y %d es: %d"%(valor_a, valor_b, valor_c, valormax))