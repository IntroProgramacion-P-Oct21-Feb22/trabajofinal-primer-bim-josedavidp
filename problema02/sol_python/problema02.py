porcent_1 = 20
porcent_2 = 25
porcent_3 = 40
porcent_4 = 50
numtrajes = int(input("¿Qué cantidad de trajes desea comprar? "))
costtraje = int(input("¿Cuál es el costo del traje? "))
if ( numtrajes == 1):
    subtotal = costtraje * numtrajes
    desc = (subtotal * porcent_1)/100
else:
    if (numtrajes == 2):
        subtotal = costtraje * numtrajes
        desc = (subtotal * porcent_2) / 100
    else:
        if (numtrajes == 3):
            subtotal = costtraje * numtrajes
            desc = (subtotal * porcent_3) / 100
        else:
            if (numtrajes > 3):
                subtotal = costtraje * numtrajes
                desc = (subtotal * porcent_4) / 100

total_a_pagar = subtotal - desc
print("Subtotal: %.2f" %(subtotal))
print("Descuento obtenido por el cliente: %.2f" %(desc))
print("El total a pagar es: %.2f" %(total_a_pagar))
