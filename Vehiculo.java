import java.text.DecimalFormat;

abstract class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public double getPrecio(){
        return precio;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getFormatoPrecio(){
        DecimalFormat formatoValor = new DecimalFormat("$###,###,##0.00");
        return formatoValor.format(precio);
    }

    public String getInfoVehiculo(){
        return "";
    }
    
    public String getMarcaYModelo(){
        return String.format("%s %s", getMarca(), getModelo());
    }
}