public class persona extends finanzas {
    private double ahorros;
    
    public persona(String nombre, double ingresos, double gastosHogar, double gastosPersonales, double ahorros) {
        super(nombre, ingresos, gastosHogar, gastosPersonales);
        this.ahorros = ahorros;
    }

    public double getAhorros() {
        return ahorros;
    }

    public void setAhorros(double ahorros) {
        this.ahorros = ahorros;
    }
    @Override
    public void calcular(){
        double totalGastos = getIngresos() - (getGastosHogar() + getGastosPersonales() + getAhorros());
        double ahorroFinal = getAhorros() - totalGastos;
        System.out.println("tus ahorros son " + ahorroFinal);
    }
}