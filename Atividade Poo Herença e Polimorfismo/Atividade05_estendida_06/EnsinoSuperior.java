package Atividade05_estendida_06;

public class EnsinoSuperior extends EnsinoMedio
{
    private String universidade;

    public EnsinoSuperior() {
        this.setRendaBasica(this.getRendaBasica() + (this.getRendaBasica() * 1));
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
        System.out.println("Funcionando setUniversidade");
    }
}
