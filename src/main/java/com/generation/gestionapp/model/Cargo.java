package com.generation.gestionapp.model;

import jakarta.persistence.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity //le decimos que represetna una tabla
@Table(name = "cargos")
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // para que sepa que es unico y autoincrementable
    private long cargoId; //lo va a dejar como cargo_id

    @Column (name = "nombreCargo") // permite crear
    @Size(max = 40) // validacion
    private String nombreCargo;

    @Column (name = "descripcionCargo")
    @Size(max = 100) // validacion
    private String cargoDescripcion;

    // mas validaciones
    @Column (name = "sueldoCargo")
    @Min(value = 450000, message = "Indicar un sueldo mayor a $450.000")
    @Max(value = 1000000, message = "Indicar un sueldo menor a $1.000.000")
    private Integer sueldoCargo;

    //constructor
    public Cargo() {
    }

    public Cargo(String nombreCargo, String cargoDescripcion, Integer sueldoCargo) {
        this.nombreCargo = nombreCargo;
        this.cargoDescripcion = cargoDescripcion;
        this.sueldoCargo = sueldoCargo;
    }

    //getter y setter
    public long getCargoId() {
        return cargoId;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public String getCargoDescripcion() {
        return cargoDescripcion;
    }

    public void setCargoDescripcion(String cargoDescripcion) {
        this.cargoDescripcion = cargoDescripcion;
    }

    public Integer getSueldoCargo() {
        return sueldoCargo;
    }

    public void setSueldoCargo(Integer sueldoCargo) {
        this.sueldoCargo = sueldoCargo;
    }

}
