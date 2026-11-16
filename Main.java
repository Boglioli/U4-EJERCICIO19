public class Main {
    public static void main(String[] args) {
        MetodoEnvio terrestre = new EnvioTerrestre(1500);
        MetodoEnvio aereo = new EnvioAereo(3000);
        MetodoEnvio ecologico = new EnvioEcologico(1000);
        SistemaTarifario sistema = new SistemaTarifario();
        double peso = 5;
        double distancia = 100;
        System.out.println("costo de envio");
        System.out.println("---------------");
        System.out.println("envio terrestre: $ " + sistema.calcularPresupuesto(terrestre, peso, distancia));
        System.out.println("envio aereo: $ " + sistema.calcularPresupuesto(aereo, peso, distancia));
        System.out.println("envio ecologico: " + sistema.calcularPresupuesto(ecologico, peso, distancia));

    }
}
