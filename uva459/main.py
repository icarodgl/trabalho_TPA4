'''
uva459
Icaro Duarte
'''
def main():
    lista_entrada = []
    while True:
        try:
            entrada = input().strip()
        except:
            break
        if entrada != '':
            lista_entrada.append(entrada)



    loop = int(lista_entrada[0])

    pos = ord(lista_entrada[1]) - 64
    lista_entrada.pop(0)
    adjacencias = []
    while loop:

        loop -= 1





def cria_adjacencias(adjacentes:list, nos:list):
    col = []
    for i in range(len(nos)):
        if len(nos[i]) == 2:
            size = ord(nos[i])
            col = size*[None]
            col[size] = nos[i]
            adjacentes.append(col)
        else:
            no = nos[i]
            if col[no[0]] != None:
                col[no[0]].append(no[1])
            else:
                col[no[0]]






main()
