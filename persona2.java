public class persona2 extends finanzas {
    private double gastosPareja;

    public persona2(String nombre, double ingresos, double gastosHogar, double gastosPersonales, double gastosPareja) {
        super(nombre, ingresos, gastosHogar, gastosPersonales);
        this.gastosPareja = gastosPareja;
    }

    public double getGastosPareja() {
        return gastosPareja;
    }

    public void setGastosPareja(double gastosPareja) {
        this.gastosPareja = gastosPareja;
    }
    @Override
    public void calcular(){
        double totalGastos = getIngresos() - (getGastosHogar() + getGastosPersonales() + getGastosPareja());
        System.out.println("tus gastos totales son " + totalGastos); 
}
    
}
