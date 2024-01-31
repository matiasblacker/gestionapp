package com.generation.gestionapp.model;

import jakarta.persistence.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity //le decimos que representa una tabla
@Table(name = "empleados") //podemos especificar el nombre de la tabla, nombre en plural
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // para que sepa que es unico y autoincrementable
    // por defecto lo dejara como empleado_id
    private long empleadoId;

    //LLave foranea a Cargo
    @ManyToOne
    @JoinColumn(name = "cargo_id") // Nombre de la columna que contendrá la llave foránea
    private Cargo cargoEmpleado; // Referencia a la clase Cargo

    @Column (name = "nombreEmpleado") // permite crear
    @Size(min = 3, max = 40) // validacion para
    private String nombreEmpleado;

    @Column (name = "direccionEmpleado")
    @Size(min = 3, max = 40) // validacion
    private String direccionEmpleado;

    // mas validaciones
    @Min(value = 1, message = "Indicar un numero mayor a 1")
    @Max(value = 10, message = "Indicar un numero mayor a 10")
    @Column (name = "aniosAntiguedad")
    private Integer aniosAntiguedad;

    @Email(message = "no se introdujo un correo válido")
    @Column (name = "correoEmpleado")
    private String correoEmpleado;


    // constructor
    public Empleado() {
    }

    public Empleado(Cargo cargoEmpleado, String nombreEmpleado, String direccionEmpleado, Integer aniosAntiguedad, String correoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.direccionEmpleado = direccionEmpleado;
        this.aniosAntiguedad = aniosAntiguedad;
        this.correoEmpleado = correoEmpleado;
    }

    //getter y setter
    public long getEmpleadoId() {
        return empleadoId;
    }

    public Cargo getCargoEmpleado() {
        return cargoEmpleado;
    }

    public void setCargoEmpleado(Cargo cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }

    public Integer getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(Integer aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }
}
