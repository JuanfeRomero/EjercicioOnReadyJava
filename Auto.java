public class Auto extends Vehiculo{
    private int puertas;

    public Auto(String marca, String modelo, double precio, int puertas){
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas(){
        return puertas;
    }

    public String getInfoVehiculo(){
        String resultado = String.format("Marca: %s // Modelo: %s // Puertas: %d // Precio: %s", getMarca(), getModelo(), getPuertas(), getFormatoPrecio());
        return resultado;
    }

}
