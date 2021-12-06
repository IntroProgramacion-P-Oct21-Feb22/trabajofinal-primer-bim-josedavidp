num = 1
den = 1
suma = 0
while ( den < 100):
    resultado = num/den
    den = den + 1
    suma = suma + resultado
    print("+%d/%d"%(num, den))
print("La suma de las fracciones es: %.2f\n" %(suma))
