public class SistemaTarifario {
    public double calcularPresupuesto(MetodoEnvio metodo, double pesokg, double distanciakm) {
        return metodo.calcularTarifa(pesokg, distanciakm);
    }
}
