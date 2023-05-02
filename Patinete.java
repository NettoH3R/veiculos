public class Patinete extends Veiculos{
    
    public Patinete(String marca, String modelo, String cor, int ano) {
        super(marca, modelo, cor, ano);
    }

    public void marca() {
        System.out.println("Marca do veículo: " + marca);

    }

    public void modelo() {
        System.out.println("Modelo do veículo: " + modelo);
    }

    public void cor() {
        System.out.println("Cor do veículo: " + cor);
    }

    public void ano() {
        System.out.print("Ano veículo: " + ano);
    }
    
}
