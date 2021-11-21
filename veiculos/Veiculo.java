package veiculos;

public class Veiculo {
    public int ano;
    public int portas;
    public String marca;
    public double velocidade;
    public Boolean ligado = false;

    public String getMarca() {
        return (marca);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return (ano);
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return (ano);
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void start_stop() {
        if (this.ligado) {
            this.ligado = false;
            System.out.println("Veículo desligado!");
        } else {
            this.ligado = true;
            System.out.println("Veículo ligado!");
        }

    }


    public void infVeiculo() {
        System.out.printf("--- Informacao do Veículo ----\n");
        System.out.printf("Marca: %s%n", this.marca);
        System.out.println("Ligado?: " + this.ligado);
        System.out.printf("Ano de fabricacao: %d%n", this.ano);
        System.out.printf("Velocidade maxima: %f%n", this.velocidade);
    }
}
