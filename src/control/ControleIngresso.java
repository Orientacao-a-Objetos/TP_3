package control;

/**Faz a comunica��o com a classe modelo para manipular dados do Ingresso
 * @version 1.0
 * @author Pedro V.
 * @since Out 2021
 */
import modelo.Ingresso;

public class ControleIngresso {

	// Array para guardar ingresso

	private Ingresso[] in;
	private int QntIngressos;

	public ControleIngresso(ControleDados d) {
		in = d.getIngressos();
		QntIngressos = d.getQntIngressos();

		/**
		 * M�todo para guardar os ingressos
		 * 
		 * @author Pedro V.
		 * @param d ControleDados - Chama a classe que possui os gets e sets do dado
		 */
	}

	// Array de String que ir� aparecer no Jlist

	public String[] getNomeIngresso() {
		String[] s = new String[QntIngressos];
		for (int i = 0; i < QntIngressos; i++) {
			s[i] = in[i].getNomeFilme();
		}

		return s;

		/**
		 * Cria um array de string com os nomes dos filmes dentro do ingresso que ir�
		 * para aparecer na jlist
		 * 
		 * @author Pedro V.
		 * @return s - Lista com os nomes dos filmes na mesma posi��o no array de
		 *         Ingresso
		 */
	}

	public String[] getPesquisaEsp(String pesEsp) { //////////////////////////
		String[] s = new String[QntIngressos];
		for (int i = 0; i < QntIngressos; i++) {
			if ((in[i].getNomeEsp()).contains(pesEsp)) {
				s[i] = in[i].getNomeFilme();
			}
		}

		return s;

		/**
		 * Cria um array de string com os nomes dos filmes dentro do ingresso que ir�
		 * para aparecer na jlist
		 * 
		 * @author Pedro V.
		 * @return s - Lista com os nomes dos filmes na mesma posi��o no array de
		 *         Ingresso
		 */
	}

	public int getQtd() {
		return QntIngressos;
	}

	public void setQtd(int qtd) {
		this.QntIngressos = qtd;
	}

	public String getNome(int i) {
		return in[i].getNomeFilme();
	}

	public String getNomeEsp(int i) {
		return in[1].getNomeEsp();
	}

	public int getSala(int i) {
		return in[i].getNumSala();
	}

	public void setQtdIngresso(int QntIngressos) {
		this.QntIngressos = QntIngressos;
	}

	public String gethoraFilme(int i) {
		return in[i].getHoraFilme();
	}

	public String getTipoEntrada(int i) {
		return in[i].getTipoEntrada();
	}

	public int getId(int i) {
		return in[i].getId();
	}

}
