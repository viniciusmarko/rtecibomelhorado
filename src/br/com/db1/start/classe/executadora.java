package br.com.db1.start.classe;

public class executadora {
	public static void main(String[] args) {

		Endereco endereco = new Endereco();
		endereco.setCep(80540150);
		System.out.println(endereco.getCepFormatado());
	
	
		Emitente emitente = new Emitente();
		emitente.setDocumento("10010010011");
		System.out.println(emitente.getDocumentoFormatado());
	}
}
