x = int(input("Ingrese un valor para x: "))
y = int(input("Ingrese un valor para y: "))

if (x > 0 and y > 0) :
    print("Los datos que usted ha ingresado pertenecen al Primer Cuadrante")
else:
    if(x < 0 and y > 0):
        print("Los datos que usted ha ingresado pertenecen al Segundo Cuadrante")
    else:
        if(x < 0 and y < 0):
            print("Los datos que usted ha ingresado pertenecen al Tercer Cuadrante")
        else:
            if (x > 0 and y < 0):
                print("Los datos que usted ha ingresado pertenecen al Tercer Cuadrante")