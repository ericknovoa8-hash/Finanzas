public class personas4 extends finanzas {
    private double gastosMascotas;

    public personas4(String nombre, double ingresos, double gastosHogar, double gastosPersonales, double gastosMascotas) {
        super(nombre, ingresos, gastosHogar, gastosPersonales);
        this.gastosMascotas = gastosMascotas;
    }

    public double getGastosMascotas() {
        return gastosMascotas;
    }

    public void setGastosMascotas(double gastosMascotas) {
        this.gastosMascotas = gastosMascotas;
    }
    @Override
    public void calcular(){
        double totalGastos = getIngresos() - (getGastosHogar() + getGastosPersonales() + getGastosMascotas());
        System.out.println("tus gastos totales son " + totalGastos);
    
    }
}
