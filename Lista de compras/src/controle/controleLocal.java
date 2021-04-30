import modelo.*;

public class ControleLocal {
    private Dados d = new Dados();

    public ControleLocal() {
        d.fillWithSomeData();
    }

    public Dados getDados() {
        return d;
    }
    public void setDados(Dados d) {
        this.d = d;
    }

    public Mercado[] getMercado() {
        return this.d.getMercado();
    }

    public int getQtdMercado() {
        return this.d.getQtdMercado();
    }

    public int getQtdFeira() {
        return this.d.getQtdFeira();
    }

    public Feira[] getFeira() {
        return this.d.getFeira();
    }

    public int getQtdAcougue() {
        return this.d.getQtdAcougue();
    }

    public Acougue[] getAcougue() {
        return this.d.getAcougue();
    }
public boolean inserirEditarFeira(String[] dadosFeira) {
        if(!dadosFeira[3].matches("[0-9]+")  !dadosFeira[4].matches("[0-9]+")  
                !dadosFeira[5].matches("[0-9]+")  !dadosFeira[6].matches("[0-9]+")) {
            return false;
        } else {
                Feira f = new Feira(dadosFeira[1], Double.parseDouble(dadosFeira[2]), 
                        Integer.parseInt(dadosFeira[3]), Integer.parseInt(dadosFeira[4]));

                d.inserirEditaFeira(f, Integer.parseInt(dadosFeira[0]));
                return true;
        }
    }
    // a posicao 0 do vetor dadosAlunos indica onde os dados devem ser inseridos
    public boolean inserirEditarmercado(String[] dadosMercado) {
        if(!dadosMercado[3].matches("[0-9]+")  !dadosMercados[4].matches("[0-9]+")  
                !dadosMercados[5].matches("[0-9]+")  !dadosMercados[6].matches("[0-9]+")) {
            return false;
        } else {
                Mercado m = new Mercado(dadosMercado[1], dadosMercado[2], Integer.parseInt(dadosMercado[3]), 
                        Integer.parseInt(dadosMercado[4]));
                d.inserirEditarMercado(m, Integer.parseInt(dadosMercado[0]));
                return true;
        }
    }


}
