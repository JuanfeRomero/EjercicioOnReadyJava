import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos = generarListaDeVehiculos();
        
        datosVehiculos(vehiculos);
        System.out.println("=============================");
        conseguirCaro(vehiculos);
        conseguirBarato(vehiculos);
        modeloConY(vehiculos);
        System.out.println("=============================");
        vehiculosOrdenadosPorPrecio(vehiculos);

    }

    public static List<Vehiculo> generarListaDeVehiculos(){
        List<Vehiculo> listaGenerada = new ArrayList<>();

        Auto auto1 = new Auto("Peugeot", "206", 200000.00, 4);
        listaGenerada.add(auto1);
        Moto moto1 = new Moto("Honda", "Titan", 60000.00, 125);
        listaGenerada.add(moto1);
        Auto auto2 = new Auto("Peugeot", "208", 250000.00, 5);
        listaGenerada.add(auto2);
        Moto moto2 = new Moto("Yamaha", "YBR", 80500.50, 160);
        listaGenerada.add(moto2);

        return listaGenerada;
    } 

    public static void datosVehiculos(List<Vehiculo> lista){
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i).getInfoVehiculo());
        }
    }

    public static void conseguirCaro(List<Vehiculo> lista){
        double valorActual = 0;
        String vehiculoActual = "";
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).getPrecio() > valorActual){
                valorActual = lista.get(i).getPrecio();
                vehiculoActual = lista.get(i).getMarcaYModelo();
            }
        }
        System.out.println("Vehículo más caro: "+ vehiculoActual);
    }

    public static void conseguirBarato(List<Vehiculo> lista){
        double valorActual = 999999999;
        String vehiculoActual = "";
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).getPrecio() < valorActual){
                valorActual = lista.get(i).getPrecio();
                vehiculoActual = lista.get(i).getMarcaYModelo();
            }
        }
        System.out.println("Vehículo más barato: "+ vehiculoActual);
    }

    public static void modeloConY(List<Vehiculo> lista){
        String vehiculoActual = "";
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).getModelo().toLowerCase().indexOf("y") > -1){
                vehiculoActual = String.format("%s %s", lista.get(i).getMarcaYModelo(), lista.get(i).getFormatoPrecio());
            }
        }
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + vehiculoActual); 
    }

    public static void vehiculosOrdenadosPorPrecio(List<Vehiculo> lista){
        List<String> vehiculosOrdenados = new ArrayList<>();
        while(lista.size() > 0){
            int i = 0;
            int mayorActual = i;
            for(int j = i+1; j < lista.size(); j++){
                if(lista.get(j).getPrecio() > lista.get(mayorActual).getPrecio()){
                    mayorActual = j;
                }
            }
            String vehiculoMayor = lista.get(mayorActual).getMarcaYModelo();
            vehiculosOrdenados.add(vehiculoMayor);
            lista.remove(mayorActual);
        }
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        for(String i: vehiculosOrdenados){
            System.out.println(i);
        }
    }
}
