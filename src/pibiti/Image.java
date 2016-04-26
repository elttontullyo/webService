package pibiti;

public class Image {
	
	private int id;
	private byte[] imagem;
	
	
	
	public Image(int id, byte[] imagem) {
		super();
		this.id = id;
		this.imagem = imagem;
	}



	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Image(int id) {
		super();
		this.id = id;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public byte[] getImagem() {
		return imagem;
	}



	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}
		

}
