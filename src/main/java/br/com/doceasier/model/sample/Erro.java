package br.com.doceasier.model.sample;

public class Erro {

	private Integer codigo;
	private String mensagem;
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	@Override
	public String toString() {
		return "Erro [codigo=" + codigo + ", mensagem=" + mensagem + "]";
	}

}