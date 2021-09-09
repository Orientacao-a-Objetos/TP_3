
public class Filme extends Conteudo {
	
	
	// Atributos //
	
	private int duracao;
	private String genero;
	private double valor;
	private int faixaEtaria;
	private String dimensao;
	private int numSala;
	private String audio;
	private int espCad;
	
	// Get Set
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getFaixaEtaria() {
		return faixaEtaria;
	}
	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	public String getDimensao() {
		return dimensao;
	}
	public void setDimensao(String dimensao) {
		this.dimensao = dimensao;
	}
	public int getNumSala() {
		return numSala;
	}
	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}
	public String getAudio() {
		return audio;
	}
	public void setAudio(String audio) {
		this.audio = audio;
	}
	public int getEspCad() {
		return espCad;
	}
	public void setEspCad(int espCad) {
		this.espCad = espCad;
	}
	
	//M�todo construtor//
	public Filme(int duracao, String genero, double valor, int faixaEtaria, String dimensao, int numSala, String audio, int espCad) {
		Super(); //adicionando constructor da classe conte�do
		setDuracao(duracao);
		setGenero(genero);
		setValor(valor);
		setFaixaEtaria(faixaEtaria);
		setDimensao(dimensao);
		setNumSala(numSala);
		setAudio(audio);
		setEspCad(espCad);
	}
	
	private void Super() {
		// TODO Auto-generated method stub
		
	}
	// M�todos //
	
	public void cadFilme(){
		// Fun��o de cadastro filme
	}
	
	public void edFilme(){
		// Fun��o de edi��o
	}
	
	public void dellFilme(){
		// Fun��o de delete
	}
	
	public void buscFilme(){
		// Fun��o de busca
	}

}
