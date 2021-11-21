package veiculos;

public class Moto extends Veiculo{
    private String tipo;
    private String freio;

    public String getTipo() {
        return (tipo);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFreio() {
        return (freio);
    }

    public void setFreio(String freio) {
        this.freio = freio;
    }


    @Override
    public void infVeiculo(){
        System.out.printf("--- Informacao da Moto ---- \n");
        System.out.printf("Tipo: %s%n", this.tipo);
        System.out.printf("Freio: %s%n", this.freio);
    }
}
