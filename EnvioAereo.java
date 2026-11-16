public class EnvioAereo extends MetodoEnvio {
    public EnvioAereo(double tarifaBase) {
        super(tarifaBase);
    }
    @Override
    public double calcularTarifa(double pesokg, double distanciakm) {
        return tarifaBase + (pesokg * 250) + (distanciakm * 10);
    }
}
