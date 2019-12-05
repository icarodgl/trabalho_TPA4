def main():
    lista_entrada = []
    while True:
        try:
            entrada = input()
        except:
            break
        if entrada != '':
            lista_entrada.append(entrada)

    print(lista_entrada)

    loop = ord(lista_entrada[0][0])

    pos = ord(lista_entrada[1]) - 64

    adjacencias = []
    while loop:
        loop -= 1
        for i in range(pos):
            p = i + 2
            for i in range(len(lista_entrada[pos])):
                if i == 0:
                    for j in range(len(adjacencias)):
                        if lista_entrada[pos][i] == adjacencias[j]:
                            adjacencias.append(lista_entrada[pos][i] + 1)
                            i += 1
    print(adjacencias)


main()
