public class EnvioTerrestre extends MetodoEnvio {
    public EnvioTerrestre(double tarifaBase) {
        super(tarifaBase);
    }
    @Override
    public double calcularTarifa(double pesokg, double distanciakm) {
        return tarifaBase + (pesokg * 100) + (distanciakm * 50);
    }
}
