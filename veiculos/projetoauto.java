package veiculos;

public class projetoauto {
    public static void main(String[] args) {

        Veiculo teste = new Veiculo();

        teste.setMarca("Testes");
        teste.setAno(2020);
        teste.setVelocidade(150.00);
        teste.start_stop();
        teste.infVeiculo();

        Carro fiat = new Carro();
        fiat.setModelo("Economico");
        fiat.setAr(true);
        fiat.setMarca("fiat");
        fiat.setAno(2012);
        fiat.setVelocidade(120.00);
        fiat.infVeiculo();

        Caminhao ford = new Caminhao();
        ford.setCarroceria("longa");
        ford.setSuspensao("mola");
        ford.setMarca("ford");
        ford.setAno(2008);
        ford.setVelocidade(80.00);
        ford.infVeiculo();


        Moto honda = new Moto();
        honda.setTipo("esporte");
        honda.setFreio("ABS");
        honda.setMarca("honda");
        honda.setAno(2022);
        honda.setVelocidade(290.00);
        honda.start_stop();
        honda.infVeiculo();

    }
    
}
