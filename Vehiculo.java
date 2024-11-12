public class Vehiculo {
    private String marca;
    private String modelo;
    private Integer anio_fabricacion;


    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo(String marca, String modelo, Integer anio_fabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio_fabricacion = anio_fabricacion;
    }

    public Vehiculo(String modelo, Integer anio_fabricacion) {
        this.modelo = modelo;
        this.anio_fabricacion = anio_fabricacion;
    }

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio_fabricacion() {
        return anio_fabricacion;
    }

    public void setAnio_fabricacion(Integer anio_fabricacion) {
        this.anio_fabricacion = anio_fabricacion;
    }

    public String mostrarInformacion(){
        return "Marca: " + marca + " Modelo: "+modelo + " Año de fabricación: "+anio_fabricacion;
    }

}
