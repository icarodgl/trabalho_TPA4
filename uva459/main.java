/**
UVA459
Icaro Duarte
*/
import java.util.*;

class Main {
	static boolean[] visitados;
	static ArrayList<Integer>[] pais;
	static ArrayList<Integer>[] adjacentes;
	

		private static void contador(int valor) {
		visitados[valor] = true;
		for (int i = 0; i < adjacentes[valor].size(); i++) {
			if (!visitados[adjacentes[valor].get(i)]) {
				contador(adjacentes[valor].get(i));
			}
		}
	}


	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int loop = scanner.nextInt();
		scanner.nextLine();
		scanner.nextLine();
		int fixo = 'A' - 1;
		while (loop > 0) {
			loop--;

			char ultimo = scanner.nextLine().charAt(0);
			int qtNos = ultimo - fixo;
			adjacentes = new ArrayList[qtNos];
			for (int i = 0 ; i < qtNos; i++){
				adjacentes[i] = new ArrayList<Integer>();
			}
			String no;

			while((scanner.hasNextLine()) && !((no = scanner.nextLine()).equals(""))){
				int pai, filho;
				pai = no.charAt(0) - fixo;
				filho = no.charAt(1) - fixo;

				adjacentes[filho - 1].add(pai-1);
				adjacentes[pai - 1].add(filho-1);
				
			}
			visitados = new boolean[adjacentes.length];
			int cont = 0;
			for(int c= 0; c < adjacentes.length; c++){
				if(!visitados[c]){
					cont++;
					contador(c);
				}
			}
			System.out.println(cont);
			if (loop > 0){
				System.out.println();
			}
			
		}
    
	}
}
