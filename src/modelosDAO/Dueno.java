package modelosDAO;

import java.io.Serializable;

public class Dueno implements Serializable {

    private Integer IdDueño;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private Dueno dueno;

    public Dueno() {
    }

    public Dueno(String Nombre, String Direccion, String Telefono) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }
    public void setId(Integer IdDueño){
        this.IdDueño = IdDueño;
    }
    public Integer getId(){
        return IdDueño;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public String getNombre(){
        return Nombre;
    }

    public void setDireccion(String Direccion){
        this.Direccion=Direccion;
    }
    public String getDireccion(){
        return Direccion;
    }

    public void setTelefono(String Telefono){
        this.Telefono=Telefono;
    }
    public String getTelefono(){
        return Telefono;
    }


    public void setDueño(Dueno dueno) {
        this.dueno = dueno;
    }
    public Dueno getDueño() {
        return dueno;
    }
}
