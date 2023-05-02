public class Principal {
    public static void main(String[] args) {
        Bike bike1 = new Bike("Caloi", "Caloi 10", "Vermelha", 2015);
        Mobilete mobilete1 = new Mobilete("Mobilete", "Mobi 25", "Preta", 2022);
        Patinete patinete1 = new Patinete("HotWeels", "Rodinhas Quentes", "Azul", 2020);

        bike1.modelo();
        bike1.marca();
        bike1.cor();
        bike1.ano();

        System.out.println("\n");

        mobilete1.modelo();
        mobilete1.marca();
        mobilete1.cor();
        mobilete1.ano();

        System.out.println("\n");

        patinete1.modelo();
        patinete1.cor();
        patinete1.marca();
        patinete1.ano();


    }
}
