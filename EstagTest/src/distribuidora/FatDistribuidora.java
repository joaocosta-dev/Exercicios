package distribuidora;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class FatDistribuidora {

	public static void main(String[] args) {
		double sp = 67836.43;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double outros = 19849.53;

		double totalMensal = sp + rj + mg + es + outros;

		double percSp = (sp/totalMensal) * 100;
		double percRj = (rj/totalMensal) * 100;
		double percMg = (mg/totalMensal) * 100;
		double percEs = (es/totalMensal) * 100;
		double percOutros = (outros/totalMensal) * 100;
		
		DecimalFormat fmt = new DecimalFormat("0.00");
		String percSpForm = fmt.format(percSp);
		String percRjForm = fmt.format(percRj);
		String percMgForm = fmt.format(percMg);
		String percEsForm = fmt.format(percEs);
		String percOutrosForm = fmt.format(percOutros);
		
		JOptionPane.showMessageDialog(null,
				"SP: " + percSpForm + "\nRJ: " + percRjForm + "\nMG: " + percMgForm + "\nES: " + percEsForm + "\nOutros: " + percOutrosForm);
	}

}
