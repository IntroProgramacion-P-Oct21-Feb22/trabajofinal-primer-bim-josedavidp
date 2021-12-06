band = 2
cadena_1 = " "
metros = float(input("Ingresar una medida en metros: "))
while( band <= metros):
    yardas = (band * 1)/0.9144

    pulgadas = (band * 39.3701)/1

    pies = (band * 3.28084)/1
    cadena_1 = ("%s\n     %s         %.2f       %.2f       %.2f   "
                %(cadena_1, band, yardas, pulgadas, pies))
    band = band + 1
cadena_2 = ("|  Metros  |  yardas  |  Pulgadas  |  Pies   |")
cadena_final = ("%s%s"%(cadena_2,cadena_1))
print(cadena_final)