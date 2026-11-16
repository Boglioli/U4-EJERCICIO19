public class EnvioEcologico extends MetodoEnvio{
    public EnvioEcologico(double tarifaBase) {
        super(tarifaBase);
    }
    @Override
    public double calcularTarifa(double pesokg, double distanciakm) {
        return tarifaBase + (pesokg * 50) + (distanciakm * 50);
    }
}
