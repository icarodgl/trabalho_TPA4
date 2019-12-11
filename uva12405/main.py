'''
UVA12405
Icaro Duarte
'''

loop = int(input())
cont = 1
while loop != 0:
    loop=-1
    try:
        caracteres = int(input())
        texto = input()
    except:
        break
    acc = 0
    i = 0
    while i < caracteres:
        if texto[i] == '.':
            acc+=1
            i+=3
        else:
            i+=1


    print('Case %d: %d' %(cont,acc))
    cont+=1