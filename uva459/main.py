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

    loop = int(lista_entrada[0][0])

    pos = ord(lista_entrada[1][0]) - 64

    adjacencias = []
    while loop:
        print(loop)
        loop -= 1

        primeiro = input()

        while




main()
