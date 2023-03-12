package src;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
//declarando e inicializando as variaveis de pontos dos jogadores: josh e steve 
		int pj = 0, pe=0; String nome1, nome2;
		
		JOptionPane.showMessageDialog(null,"Jogo da sorte");

		nome1=JOptionPane.showInputDialog("Digite o nome do jogador 1:");
		nome2=JOptionPane.showInputDialog("Digite o nome do jogador 2:");

		
	//Inicializando os decks com uma lista do tipo inteiro(ultilizar o tipo integer nos permite ultilizar propriedades de objeto como get, set e etc)
		List <Integer> deckjosh  = Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,13,14) ; 	
		List <Integer> deckesteve  = Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,13,14) ;
	
	//metodo pra misturar as posições dos elementos dentro da lista
		Collections.shuffle(deckjosh);
		Collections.shuffle(deckesteve);
	
	//verificando quem ganhou cada rodada e atribuindo a pontuação
	
			for(int i=0; i < deckesteve.size();i++) {
				String chare = null,charj = null;
				if(deckjosh.get(i) > deckesteve.get(i) ) {
					pj++;
				}
				else if(deckjosh.get(i) < deckesteve.get(i) ) {
					pe++;
				}
	// Inserindo no baralho de josh as cartas com letras
				charj=Integer.toString(deckjosh.get(i)) ;
				switch(deckjosh.get(i)) {
					case 10:
						charj="T";
					break;
		
					case 11:
						charj="J";
					break;
		
					case 12:
						charj="Q";
					break;
			
					case 13:
						charj="K";
					break;
			
					case 14:
						charj="A";
					break;
				}
		// Inserindo no baralho de steve as cartas com letras
				
				chare=Integer.toString(deckesteve.get(i)) ;
				switch(deckesteve.get(i)) {
					case 10:
						chare="T";
					break;
				
					case 11:
						chare="J";
					break;
				
					case 12:
						chare="Q";
					break;
					
					case 13:
						chare="K";
					break;
					
					case 14:
						chare="A";
					break;
									
				}
				JOptionPane.showMessageDialog(null,nome1+" "+ charj+" x "+chare+" "+nome2+"\n"+nome1+": "+pj+"  "+nome2+": "+pe);
			}
	//verificando o resultado e exibindo a pontuação 
		if(pe>pj) {
		/*return*/JOptionPane.showMessageDialog(null,nome2+" venceu!!!"); 
		}	
		else if(pj>pe) {
			/*return*/JOptionPane.showMessageDialog(null,nome1+" venceu!!!");
		}
		else {
		/*return*/JOptionPane.showMessageDialog(null,"Empate");
		}
	}

}
//for(String item : deck) {
//		System.out.println(item); 
	
/*	List deck = new ArrayList();
	for(int i=2;i<=9;i++) {
	deck.add(i);
	}*/
	/*deck.add(10,"T");
	deck.add(11,"J");
	deck.add(12,"Q");
	deck.add(13,"K");
	deck.add(14,"A");
	
	for(Object item : deck) {
		System.out.println(item);
	}*/
//Collections.shuffle(globo); //Embaralha o globo

//Imprime os 5 primeiros números aleatórios.
//for (int i = 0; i < 5; i++){
//System.out.println(globo.get(i));


//}