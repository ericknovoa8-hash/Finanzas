public class persona3 extends finanzas {
    private double gastosHijos;

    public persona3(String nombre, double ingresos, double gastosHogar, double gastosPersonales, double gastosHijos) {
        super(nombre, ingresos, gastosHogar, gastosPersonales);
        this.gastosHijos = gastosHijos;
    }

    public double getGastosHijos() {
        return gastosHijos;
    }

    public void setGastosHijos(double gastosHijos) {
        this.gastosHijos = gastosHijos;
    }
    @Override
    public void calcular(){
        double totalGastos = getIngresos() - (getGastosHogar() + getGastosPersonales() + getGastosHijos());
        System.out.println("tus gastos totales son " + totalGastos); 
    
    }
}