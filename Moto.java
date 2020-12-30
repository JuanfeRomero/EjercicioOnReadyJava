public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, double precio, int cilindrada){
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getInfoVehiculo(){
        String resultado = String.format("Marca: %s // Modelo: %s // Cilindrada: %dcc // Precio: %s", getMarca(), getModelo(), getCilindrada(), getFormatoPrecio());
        return resultado;
    }

}
