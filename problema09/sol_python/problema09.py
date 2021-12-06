signo = ""
signo1 = "-"
signo2 ="+"
cadena_final = ""
num1 = 0
num2 = 0
limite= 48
limite2= 44
while num2 < limite2  or num1 < limite:


    num1 += 12
    num2 += 11

    if num1 % 12 == 0 :
        signo= signo2
    else:
        if(num2 == 11 or num2 % 11 == 0):
            signo=signo1
    cadena_final = ("%s %s%d %s%d" % (cadena_final, signo2, num1, signo1, num2))
print(cadena_final)