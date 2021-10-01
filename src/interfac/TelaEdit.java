package interfac;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import control.ControleDados;

public class TelaEdit implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelSala = new JLabel("Sala: ");
	private JTextField valorSala;
	private JLabel labelHora = new JLabel("Hora: ");
	private JTextField valorHora;
	private JLabel labelDura = new JLabel("Dura��o: ");
	private JTextField valorDura;
	private JLabel labelGenero = new JLabel("Genero");
	private JTextField valorGenero;
	private JLabel Labelvalor = new JLabel("valor: ");
	private JTextField valorValor;
	private JLabel labelFaixa = new JLabel("Faixa Etaria: ");
	private JTextField valorFaixa;
	private JLabel labelDim = new JLabel("Dimens�o: ");
	private JTextField valorDim;
	private JLabel labelAudio = new JLabel("Audio: ");
	private JTextField valorAudio;
	private JLabel labelEspCad = new JLabel("Espectadores: ");
	private JTextField valorEspCad;

	private JLabel labelNascimento = new JLabel("Nasc: ");
	private JTextField valorNascimento;
	private JLabel LabelCPF = new JLabel("CPF: ");
	private JTextField valorCPF;

	private JLabel LabelEntrada = new JLabel("Entrada: ");
	private JTextField valorEntrada;
	// private JTextField valorEntrada;
	private JLabel LabelID = new JLabel("ID: ");
	private JTextField valorID;

	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[12];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	public void inserirEditar(int op, ControleDados d, TelaFilme p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1)
			s = "Cadastro Filme";
		if (op == 2)
			s = "Cadastro Espectador";
		if (op == 3)
			s = "Cadastro Ingresso";

		if (op == 4)
			s = "Edi��o Filme";
		if (op == 5)
			s = "Edi��o Espectador";
		if (op == 6)
			s = "Edi��o Ingresso";

		janela = new JFrame(s);

		if (op == 4 || op == 1) {

			if (op == 4) {
				// Criando FIlD com dados do Filme clicado

				valorNome = new JTextField(dados.getFilmes()[pos].getNomeFilme(), 200);
				valorSala = new JTextField(String.valueOf(dados.getFilmes()[pos].getNumSala()), 200);
				valorHora = new JTextField(dados.getFilmes()[pos].getHoraFilme(), 200);
				valorDura = new JTextField(String.valueOf(dados.getFilmes()[pos].getDuracao()), 200);
				valorGenero = new JTextField(dados.getFilmes()[pos].getGenero(), 200);
				valorValor = new JTextField(String.valueOf(dados.getFilmes()[pos].getValor()), 200);
				valorFaixa = new JTextField(String.valueOf(dados.getFilmes()[pos].getFaixaEtaria()), 200);
				valorDim = new JTextField(dados.getFilmes()[pos].getDimensao(), 200);
				valorAudio = new JTextField(dados.getFilmes()[pos].getAudio(), 200);
				valorEspCad = new JTextField(String.valueOf(dados.getFilmes()[pos].getEspCad()), 200);
			} else {
				// Criando FIELD para filme sem preencher com os dados

				valorNome = new JTextField(200);
				valorSala = new JTextField(200);
				valorHora = new JTextField(200);
				valorDura = new JTextField(200);
				valorGenero = new JTextField(200);
				valorValor = new JTextField(200);
				valorFaixa = new JTextField(200);
				valorDim = new JTextField(200);
				valorAudio = new JTextField(200);
				valorEspCad = new JTextField(200);
				valorNascimento = new JTextField(200);
				valorCPF = new JTextField(200);
				valorID = new JTextField(200);
				valorEntrada = new JTextField(200);
			}

			// Configura��o pagina
			labelNome.setBounds(30, 20, 100, 25);
			valorNome.setBounds(136, 20, 200, 25);
			labelSala.setBounds(30, 50, 100, 25);
			valorSala.setBounds(136, 50, 200, 25);
			labelHora.setBounds(30, 80, 100, 25);
			valorHora.setBounds(136, 80, 200, 25);
			labelDura.setBounds(30, 110, 100, 25);
			valorDura.setBounds(136, 110, 200, 25);
			labelGenero.setBounds(30, 140, 100, 25);
			valorGenero.setBounds(136, 140, 200, 25);
			Labelvalor.setBounds(30, 170, 100, 25);
			valorValor.setBounds(136, 170, 200, 25);
			labelFaixa.setBounds(30, 200, 100, 25);
			valorFaixa.setBounds(136, 200, 200, 25);
			labelDim.setBounds(30, 230, 100, 25);
			valorDim.setBounds(136, 230, 200, 25);
			labelAudio.setBounds(30, 260, 100, 25);
			valorAudio.setBounds(136, 260, 200, 25);
			labelEspCad.setBounds(30, 290, 100, 25);
			valorEspCad.setBounds(136, 290, 200, 25);

			// Inserindo configura��es na pagina

			this.janela.add(labelNome);
			this.janela.add(valorNome);
			this.janela.add(labelSala);
			this.janela.add(valorSala);
			this.janela.add(labelHora);
			this.janela.add(valorHora);
			this.janela.add(labelDura);
			this.janela.add(valorDura);
			this.janela.add(labelGenero);
			this.janela.add(valorGenero);

			this.janela.add(Labelvalor);
			this.janela.add(valorValor);
			this.janela.add(labelFaixa);
			this.janela.add(valorFaixa);
			this.janela.add(labelDim);
			this.janela.add(valorDim);
			this.janela.add(labelAudio);
			this.janela.add(valorAudio);
			this.janela.add(labelEspCad);
			this.janela.add(valorEspCad);

			this.janela.setLayout(null);
			this.janela.setSize(400, 430);
		}

		// Preenche dados com dados do Expectador clicado

		else if (op == 5 || op == 2) {

			if (op == 5) {
				// Criando FIlD com dados do Espectador clicado

				valorNome = new JTextField(dados.getEspectadores()[pos].getNome(), 200);
				valorNascimento = new JTextField(dados.getEspectadores()[pos].getNasc(), 200);
				valorCPF = new JTextField(dados.getEspectadores()[pos].getCpf(), 200);
			} else {
				// Criando FIELD para Ingresso sem preencher com os dados

				valorNome = new JTextField(200);
				valorNascimento = new JTextField(200);
				valorCPF = new JTextField(200);

			}

			// Configura��o pagina
			labelNome.setBounds(30, 20, 100, 25);
			valorNome.setBounds(136, 20, 200, 25);
			labelNascimento.setBounds(30, 50, 100, 25);
			valorNascimento.setBounds(136, 50, 200, 25);
			LabelCPF.setBounds(30, 80, 100, 25);
			valorCPF.setBounds(136, 80, 200, 25);

			// Inserindo dados
			this.janela.add(labelNome);
			this.janela.add(valorNome);
			this.janela.add(labelNascimento);
			this.janela.add(valorNascimento);
			this.janela.add(LabelCPF);
			this.janela.add(valorCPF);

			this.janela.setLayout(null);
			this.janela.setSize(400, 200);

		} else if (op == 6 || op == 3) {

			if (op == 6) {
				// Preenche dados com dados do Ingresso clicado
				valorNome = new JTextField(dados.getIngressos()[pos].getNomeFilme(), 200);
				valorSala = new JTextField(String.valueOf(dados.getIngressos()[pos].getNumSala()), 200);
				valorHora = new JTextField(dados.getIngressos()[pos].getHoraFilme(), 200);
				valorID = new JTextField(String.valueOf(dados.getIngressos()[pos].getId()), 200);
				valorEntrada = new JTextField(dados.getIngressos()[pos].getTipoEntrada(), 200);
			} else {

				// Criando FIELD para Ingresso sem preencher com os dados
				valorNome = new JTextField(200);
				valorSala = new JTextField(200);
				valorHora = new JTextField(200);
				valorID = new JTextField(200);
				valorEntrada = new JTextField(200);
			}

			// Configura��o pagina
			labelNome.setBounds(30, 20, 100, 25);
			valorNome.setBounds(136, 20, 200, 25);
			labelSala.setBounds(30, 50, 100, 25);
			valorSala.setBounds(136, 50, 200, 25);
			labelHora.setBounds(30, 80, 100, 25);
			valorHora.setBounds(136, 80, 200, 25);
			LabelID.setBounds(30, 110, 100, 25);
			valorID.setBounds(136, 110, 200, 25);
			LabelEntrada.setBounds(30, 140, 100, 25);
			valorEntrada.setBounds(136, 140, 200, 25);

			// Inserindo Dados

			this.janela.add(labelNome);
			this.janela.add(labelSala);
			this.janela.add(labelHora);
			this.janela.add(LabelID);
			this.janela.add(LabelEntrada);

			this.janela.add(valorNome);
			this.janela.add(valorSala);
			this.janela.add(valorHora);
			this.janela.add(valorID);
			this.janela.add(valorEntrada);

			this.janela.setLayout(null);
			this.janela.setSize(400, 430);
		}


		// Coloca botoes de excluir e salvar
		if (op == 4 || op == 1 || op == 6 || op == 3) {

			botaoSalvar.setBounds(220, 340, 115, 30);
			this.janela.add(botaoSalvar);

			if (op == 4 || op == 6) {
				botaoExcluir.setBounds(50, 340, 115, 30);
				this.janela.add(botaoExcluir);
			}

		} else if (op == 5 || op == 2 || op == 4) {

			botaoSalvar.setBounds(220, 110, 115, 30);
			this.janela.add(botaoSalvar);

			if (op == 5 || op == 6 || op == 4) {
				botaoExcluir.setBounds(50, 110, 115, 30);
				this.janela.add(botaoExcluir);
			}
		}
		this.janela.setResizable(false);
		this.janela.setLocationRelativeTo(null);
		this.janela.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == botaoSalvar) {
			try {
				boolean res;
				if (opcao == 1) { // cadastro de novo Filme
					novoDado[0] = Integer.toString(dados.getQtdFilmes());
				} else if (opcao == 2) { // cadastro de novo Espectador
					novoDado[0] = Integer.toString(dados.getQntEspectadores());
				} else if (opcao == 4) {// edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

					novoDado[1] = valorNome.getText();
					novoDado[2] = valorSala.getText();
					novoDado[3] = valorHora.getText();
					novoDado[4] = valorDura.getText();
					novoDado[5] = valorGenero.getText();
					novoDado[6] = valorValor.getText();
					novoDado[7] = valorFaixa.getText();
					novoDado[8] = valorDim.getText();
					novoDado[9] = valorAudio.getText();
					novoDado[10] = valorEspCad.getText();

				} else if (opcao == 5)// edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] = valorNome.getText();
				novoDado[2] = valorNascimento.getText();
				novoDado[3] = valorCPF.getText();

				if (opcao == 1 || opcao == 4)
					res = dados.inserirEditarFilme(novoDado);
				else if (opcao == 2 || opcao == 5)
					res = dados.inserirEditarEspectador(novoDado);

				if (res) {
					mensagemSucessoCadastro();
				} else
					mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if (src == botaoExcluir) {
			boolean res = false;

			if (opcao == 4) {// exclui aluno
				res = dados.removerFilme(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusaoAluno();
			}

			if (opcao == 5) { // exclui professor
				res = dados.removerEspectador(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusaoProf();
			}

			if (opcao == 6) { // exclui professor
				res = dados.removerEspectador(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusaoProf();
			}

		}
	}

	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,
				"ERRO AO SALVAR OS DADOS!\n " + "Pode ter ocorrido um dos dois erros a seguir:  \n"
						+ "1. Nem todos os campos foram preenchidos \n"
						+ "2. CPF, identidade, DDD e telefone n�o cont�m apenas n�meros",
				null, JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoAluno() {
		JOptionPane.showMessageDialog(null,
				"Ocorreu um erro ao excluir o dado.\n " + "Verifique se o aluno est� matriculado\n"
						+ "em alguma disciplina. Se sim, cancele\n " + "a matricula e tente novamente.",
				null, JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoProf() {
		JOptionPane.showMessageDialog(null,
				"Ocorreu um erro ao excluir o dado.\n " + "Verifique se o professor est� respons�vel\n"
						+ "por alguma disciplina. Se sim, substitua\n " + "o professor e tente novamente.",
				null, JOptionPane.ERROR_MESSAGE);
	}

}
