
package clases;


public class ReporteInformacionCliente {

    String tipo,marca,modelo,serie,fechaIngreso,estatus,
            ultimaFechaModificar;

    public ReporteInformacionCliente(String tipo, String marca,
            String modelo, String serie, String fechaIngreso,
            String estatus, String ultimaFechaModificar) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
        this.fechaIngreso = fechaIngreso;
        this.estatus = estatus;
        this.ultimaFechaModificar = ultimaFechaModificar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }


    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getUltimaFechaModificar() {
        return ultimaFechaModificar;
    }

    public void setUltimaFechaModificar(String ultimaFechaModificar) {
        this.ultimaFechaModificar = ultimaFechaModificar;
    }
    
}
