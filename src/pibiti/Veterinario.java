package pibiti;

public class Veterinario {
	
	private int id;
	private String email;
	private String nomeEmpresa;
	private String descricao;
	private String atendimento;
    private String cep;
    private String endereco;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String nomeVet;
    private String cpf;
    private String celular;
    private String crmv;
    private byte[] imagem;
    private String cnpj;
    
    
    public Veterinario() {
		// TODO Auto-generated constructor stub
	}

	public Veterinario(int id, String email, String nomeEmpresa, String descricao, String atendimento, String cep,
			String endereco, String numero, String bairro, String cidade, String estado, String nomeVet, String cpf,String cnpj, String celular,
			String crmv,byte[] imagem) {
		super();
		this.id = id;
		this.email = email;
		this.nomeEmpresa = nomeEmpresa;
		this.descricao = descricao;
		this.atendimento = atendimento;
		this.cep = cep;
		this.endereco = endereco;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.nomeVet = nomeVet;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.celular = celular;
		this.crmv = crmv;
		this.imagem=imagem;
		
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(String atendimento) {
		this.atendimento = atendimento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNomeVet() {
		return nomeVet;
	}

	public void setNomeVet(String nomeVet) {
		this.nomeVet = nomeVet;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCrmv() {
		return crmv;
	}

	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}

    
    

}
