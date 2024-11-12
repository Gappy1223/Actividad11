public class Vehiculo_acuatico extends Vehiculo {
    private int num_motor;
    public Vehiculo_acuatico(String marca, String modelo, Integer anio_fabricacion, Integer num_motor) {
        super(marca, modelo, anio_fabricacion);
        this.num_motor = num_motor;
    }

    public int getNum_motor() {
        return num_motor;
    }

    public void setNum_motor(int num_motor) {
        this.num_motor = num_motor;
    }
    @Override
    public String mostrarInformacion(){
        return "Marca: " + super.getMarca() + " Modelo: "+ super.getModelo() + " Año de fabricación: "+ super.getAnio_fabricacion() + " Número de motores: " + num_motor;
    }

}
