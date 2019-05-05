package Atividade05_estendida_06;

public class EnsinoMedio extends EnsinoFundamental {
    private String escolaMedia;

    public EnsinoMedio() {
        this.setRendaBasica(this.getRendaBasica() + (this.getRendaBasica() * 0.5));
    }

    public String getEscolaMedia() {
        return escolaMedia;
    }

    public void setEscolaMedia(String escolaMedia) {
        this.escolaMedia = escolaMedia;
        System.out.println("Funcioando escolaMedia");
    }
}
