/**
UVA10684
Icaro Duarte
*/

    import java.util.*;

    class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            
            int cont = scan.nextInt();
            int i = 0;
            int soma = 0;
            int maiorSoma = 0 ;
            while (cont != 0) {
                soma = 0;
                maiorSoma = 0;
                for (i = 0; i < cont; i++) {
                    int jogada = scan.nextInt();
                    soma +=jogada;
                    if(soma< 0){soma=0;}
                    
                    if (maiorSoma < soma){
                        maiorSoma = soma;
                    }
                }
                
                if (maiorSoma > 0) {
                    System.out.printf("The maximum winning streak is %d.\n", maiorSoma);
                }
                else {
                    System.out.println("Losing streak.");
                }
                cont = scan.nextInt();
            }
        }
    }