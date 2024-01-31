package com.generation.gestionapp.model;

import jakarta.persistence.*;

import javax.validation.constraints.Size;

@Entity //le decimos que representa una tabla
@Table(name = "departamentos")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // para que sepa que es unico y autoincrementable
    private long departamentoId; //lo va a dejar como cargo_id

    @Column (name = "nombreDepartmento") // permite crear
    @Size(max = 40) // validacion
    private String nombreDepartmento;

    @Column (name = "areaDepartamento")
    @Size(max = 40) // validacion
    private String areaDepartamento;

    //constructor
    public Departamento() {
    }

    public Departamento(String nombreDepartmento, String areaDepartamento) {
        this.nombreDepartmento = nombreDepartmento;
        this.areaDepartamento = areaDepartamento;
    }

    //getter y setter

    public long getDepartamentoId() {
        return departamentoId;
    }

    public String getNombreDepartmento() {
        return nombreDepartmento;
    }

    public void setNombreDepartmento(String nombreDepartmento) {
        this.nombreDepartmento = nombreDepartmento;
    }

    public String getAreaDepartamento() {
        return areaDepartamento;
    }

    public void setAreaDepartamento(String areaDepartamento) {
        this.areaDepartamento = areaDepartamento;
    }
}
