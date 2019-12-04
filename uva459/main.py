def main():
    loop = int(input())

    while loop:
        lixo = input()
        loop-=1
        grafo = []
        no = ord(input())
        print(no-64)

        while True:
            try:
                no = ord(input().strip())
            except:
                break


main()