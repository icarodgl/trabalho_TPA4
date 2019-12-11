/**
UVA108
Icaro Duarte
*/

import java.util.Scanner;

class Main
{
    public static void main (String args[]){
    	Scanner scan = new Scanner (System.in);
    	while (scan.hasNext()){	
            int n = scan.nextInt();
            int m[][];
            m = new int[n][n];
            int i = 0;
    	    int j = 0;
            int q = 0;
            while (scan.hasNext() && q <= n*n){
                q++;
                m[i][j] = scan.nextInt();
                j = (j + 1) % n;
                if (j==0) i++;
                if (i==n) break;
            }
            soma(m,n);
    	}	  	
    }
    
    static void soma(int m[][], int n){
        int maiorSoma = -32768;
        int soma = 0;
        for (int ci=0; ci<n;ci++){
            for (int cf=ci; cf<n;cf++){
                for(int li=0;li<n;li++){
                    for (int lf=li;lf<n;lf++){
                        soma = somaSubMatriz(m,li, lf, ci,cf);
                        if (soma > maiorSoma){
                            System.out.println(li+" "+lf+' '+ci+' '+cf);
                            maiorSoma = soma;
                        }
                    }
                }
            }
        }
    System.out.println(maiorSoma);
        
    }
    

    // soma a matriz de até linha a até coluna b
    static int somaSubMatriz(int m[][],int li, int lf , int ci, int cf){
        int soma = 0;
        for (int i=ci;i<cf;i++){
            for (int j=li;j<lf;j++){
                       soma += m[i][j];
                    }
                }
                return soma;
    }
}