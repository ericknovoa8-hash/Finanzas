public class finanzas {
    private String nombre;
    private double ingresos;
    private double gastosHogar;
    private double gastosPersonales;

    public finanzas(String nombre, double ingresos, double gastosHogar, double gastosPersonales) {
        this.nombre = nombre;
        this.ingresos = ingresos;
        this.gastosHogar = gastosHogar;
        this.gastosPersonales = gastosPersonales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getGastosHogar() {
        return gastosHogar;
    }

    public void setGastosHogar(double gastosHogar) {
        this.gastosHogar = gastosHogar;
    }

    public double getGastosPersonales() {
        return gastosPersonales;
    }

    public void setGastosPersonales(double gastosPersonales) {
        this.gastosPersonales = gastosPersonales;
    }
    public void calcular(){
        double totalGastos = getIngresos() - (getGastosHogar() + getGastosPersonales());
        System.out.println("tus ingresos son ");

        
    }
} 