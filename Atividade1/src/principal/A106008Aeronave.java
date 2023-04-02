package principal;

public class A106008Aeronave {

	private String tipo,registro;
	private float comprimento,envergadura;

	public A106008Aeronave(String tipo, String registro, float comprimento, float envergadura) {
		this.tipo = tipo;
		this.registro = registro;
		this.comprimento = comprimento;
		this.envergadura = envergadura;
	}
	public String retornarRegistroTipo() {
		return"<"+this.registro.toUpperCase()+"> (<"+this.tipo.toUpperCase()+">)";
	}
	public float retornarEnvergadura() {
	return this.envergadura;
	}
	public float retornarComprimento() {
	return this.comprimento;
	}


	
	
	
}
