package lista_de_compras;
public class Setor extends classificacao {
private Produto filtrarProduto;

public Setor() {
    super();
}
//sobrecarga
public Setor(Produto fp, String v, String c, String l, String f, String d) {
    filtrarProduto = fp;
    verduras = v;
    carnes = c;
    limpeza = l;
    frutas = f;
    domesticos = d;
}

public Produto getFiltrarProduto() {
    return filtrarProduto;
}

public void setFiltrarProduto(Produto filtrarProduto) {
    this.filtrarProduto = filtrarProduto;
}
}
