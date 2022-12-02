suma=0
mensaje=""
contador=0
numero=int(input("Ingrese un número par: "))
if numero<2 or numero%2!=0:
    print("Error. El número debe ser mayor o igual a 2 y par. Vuelva a ingresar")

while contador<numero:
    contador=contador+2
    mensaje=mensaje+"+"+str(contador)
    suma=suma+contador
print(mensaje)
print("La suma es: ",suma)





