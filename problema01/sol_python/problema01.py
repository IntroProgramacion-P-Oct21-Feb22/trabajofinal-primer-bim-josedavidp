triangulo=0
tr= "triangulo rectangulo"
to= "triangulo obtusangulo"
ta= "trinagulo acutangulo"

A= int(input("Ingresar valor del primer angulo"))
B= int (input("Ingresar valor del segundo angulo"))
C= int (input("Ingresar valor del tercer angulo"))
if(A==90) or (B==90) or (C==90):
    triangulo=tr
else:
    if(((A > 90) and (A < 180)) or ((B > 90) and (B < 180)) or ((C > 90) and (C < 180))):
        triangulo=to
    else:
            triangulo=ta
print("El resultadod de los datos es un: ",triangulo)


