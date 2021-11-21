package veiculos;
public class Carro extends Veiculo{
    private String modelo;
    private Boolean ar;
    private String vidro;

    public String getModelo() {
        return (modelo);
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Boolean getAr() {
        return (ar);
    }

    public void setAr(Boolean ar) {
        this.ar = ar;
    }

    public String getVidro() {
        return (vidro);
    }

    public void setVidro(String vidro) {
        this.vidro = vidro;
    }

    @Override
    public void infVeiculo(){
        System.out.printf("--- Informacao do Carro ---- \n");
        System.out.printf("Modelo: %s%n", this.modelo);
        System.out.println("Ar condicionado?: " + this.ar);
        System.out.printf("Tipo de Vidro: %s%n", this.vidro);

    }


}
