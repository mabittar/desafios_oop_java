package veiculos;

public class Caminhao extends Veiculo {

    private String suspensao;
    private String carroceria;

    public String getSuspensao() {
        return (suspensao);
    }

    public void setSuspensao(String suspensao) {
        this.suspensao = suspensao;
    }

    public String getCarroceria() {
        return (carroceria);
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    @Override
    public void infVeiculo() {
        System.out.printf("--- Informacao do Caminhão ---- \n");
        System.out.printf("suspensao: %s%n", this.suspensao);
        System.out.printf("carroceria: %s%n", this.carroceria);
    }

}
