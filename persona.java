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
        double totalGastos = getIngresos() - (getGastosHogar() + getGastosPersonales());
<<<<<<< HEAD
        System.out.println("tus ahorros son " + ahorros); 
=======
        System.out.println("tus ahorros son " + totalGastos);
>>>>>>> persona3
    }
}