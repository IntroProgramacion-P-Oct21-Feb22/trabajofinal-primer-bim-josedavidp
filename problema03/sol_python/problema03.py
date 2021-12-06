pagosextras= 0
tipo1 = 1
tipo2 = 2
tipo3 = 3
tipo4 = 4
nombreEmpleado = input("Nombre del empleado: ")
tipodeEmpleado = int(input("Ingresar el tipo de empleado(Puede ser 1, 2, 3 o 4): "))
horasTrabajadas=int(input("Horas extras trabajadas: "))
if (tipodeEmpleado == tipo1) :
    pagahora = 1.5
    pagosextras = horasTrabajadas * pagahora
else :
    if tipodeEmpleado == tipo2 :
        pagahora = 2
        pagosextras = horasTrabajadas * pagahora
    else:
        if  tipodeEmpleado == tipo3 :
            pagahora = 2.5
            pagosextras = horasTrabajadas * pagahora
        else :
            if tipodeEmpleado == tipo4 :
                pagahora = 3
                pagosextras = horasTrabajadas * pagahora
print("El pago por horas es: %.2f"%(pagosextras))