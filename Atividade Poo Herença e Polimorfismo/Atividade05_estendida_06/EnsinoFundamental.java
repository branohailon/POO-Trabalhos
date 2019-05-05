package Atividade05_estendida_06;

public class EnsinoFundamental extends NaoEstudou
{
    private String escolaBasica;

    public EnsinoFundamental() {
        this.setRendaBasica(this.getRendaBasica() + (this.getRendaBasica() * 0.1));
    }

    public String getEscolaBasica() {
        return escolaBasica;
    }

    public void setEscolaBasica(String escolaBasica) {
        this.escolaBasica = escolaBasica;
        System.out.println("Funcioando escolaBasica");
    }
}
