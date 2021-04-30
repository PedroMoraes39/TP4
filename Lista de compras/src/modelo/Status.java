package modelo;

public class Status {
	public boolean produtoPego;

	public Status(boolean pp) {

	produtoPego = pp;
	}

	public boolean isProdutoPego() {
		return produtoPego;
	}

	public void setProdutoPego(boolean produtoPego) {
		this.produtoPego = produtoPego;
	}
}
