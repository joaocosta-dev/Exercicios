/*Lendo e trabalhando com um arquivo XML, toda sua manipula��o foi feita com a API JAXP,
 * Dado um vetor que guarda o valor de faturamento di�rio de uma distribuidora, fa�a um programa,
 * na linguagem que desejar, que calcule e retorne:
� O menor valor de faturamento ocorrido em um dia do m�s;
� O maior valor de faturamento ocorrido em um dia do m�s;
� N�mero de dias no m�s em que o valor de faturamento di�rio foi superior � m�dia mensal.

IMPORTANTE:
a) Usar o json ou xml dispon�vel como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados.
 Estes dias devem ser ignorados no c�lculo da m�dia;*/
package faturamento;

import java.io.File;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


public class CalculoFaturamento {

	public static void main(String[] args) {
		try {
			
			File arquivo = new File("src/faturamento/dados.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(arquivo);

			doc.getDocumentElement().normalize();
			NodeList listaDeDados = doc.getElementsByTagName("row");

			DecimalFormat fmt = new DecimalFormat("0.00");
			int numDias = listaDeDados.getLength();
			int descontaDias = numDias;
			int fatMaiorMedia = 0;
			double maior = 0;
			double menor = 0;
			double soma = 0;
			
			for (int i = 0; i < numDias; i++) {
				Element dia = (Element) listaDeDados.item(i);
				double valor = Double.parseDouble(dia.getElementsByTagName("valor").item(0).getTextContent());
				if (valor == 0) {
					descontaDias = descontaDias - 1;
				}
				if (i == 0) {
					menor = valor;
				}
				if (valor < maior && valor < menor) {
					menor = valor;
				}
				if (valor > maior) {
					maior = valor;
				}

				soma += valor;
			}
			
			double media = soma / descontaDias;
			for (int i = 0; i < numDias; i++) {
				Element dia = (Element) listaDeDados.item(i);
				double valor = Double.parseDouble(dia.getElementsByTagName("valor").item(0).getTextContent());
				if (valor > media) {
					fatMaiorMedia++;
				}
			}
			String mediaf=fmt.format(media);
			String maiorf=fmt.format(maior);
			String menorf=fmt.format(menor);
			JOptionPane.showMessageDialog(null,"M�dia de faturamento nos dias: " + mediaf + "\nDias calculados " + descontaDias
					+ "\nMaior valor: " + maiorf + "\nMenor: " + menorf + "\nDias que o faturamento ficou maior que a m�dia: "
					+ fatMaiorMedia);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
