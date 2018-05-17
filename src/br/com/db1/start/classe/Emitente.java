package br.com.db1.start.classe;

public class Emitente {

	private String nome;

	private String documento;

	private byte[] assinatura;

	public String getDocumentoFormatado() {
		String	DocumentoFormatado = documento;
		DocumentoFormatado = DocumentoFormatado.substring(0,3)+"."+DocumentoFormatado.substring(3,6)+"."+DocumentoFormatado.substring(6,9)+"-"+
		DocumentoFormatado.substring(9,11);
			return DocumentoFormatado;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public byte[] getAssinatura() {
		return assinatura;
	}

	public void setAssinatura(byte[] assinatura) {
		this.assinatura = assinatura;
	}

}
