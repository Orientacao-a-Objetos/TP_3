package interfac;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import control.ControleDados;

public class Menu implements ActionListener {

	// Criando paramentros paras as janelas

	private static JFrame janela = new JFrame("Menu Principal");
	private static JLabel titulo = new JLabel("Cinefun");
	private static JButton filme = new JButton("Filme"); // aluno -> filme
	private static JButton ingresso = new JButton("Ingresso"); // curso -> ingresso

	public static ControleDados dados = new ControleDados();

	public Menu() {

		// Determinando tamanho dos �cones

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(160, 10, 150, 50);
		filme.setBounds(95, 70, 200, 40);
		ingresso.setBounds(95, 125, 200, 40);

		// Gerando janela com os par�metros especificados

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(filme);
		janela.add(ingresso);

		// Determinando tamanho padr�o da janela

		janela.setSize(400, 250);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

	public static void main(String[] args) {
		Menu menu = new Menu();

		filme.addActionListener(menu);
		ingresso.addActionListener(menu);
	}

	@Override
	public void actionPerformed(ActionEvent acao) {

		// e disparando a��es para o mesmo

		Object src = acao.getSource();

		if (src == filme)
			new TelaFilme().mostrarDados(dados);

		if (src == ingresso)
			new TelaIngresso().mostrarDados(dados);

	}
}