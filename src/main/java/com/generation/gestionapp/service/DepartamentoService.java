package com.generation.gestionapp.service;

import com.generation.gestionapp.model.Departamento;

public interface DepartamentoService {

    //meteodo para guardar
    Departamento guardarDepartamento(Departamento departamentoParaGuardar);

    //metodo para borrar
    void borrarDepartamentoPorId(Long departamentoid);

}
