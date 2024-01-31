package com.generation.gestionapp.service;

import com.generation.gestionapp.model.Empleado;

public interface EmpleadoService {
    //en esta interfaz se declaran metodos

    Empleado guardarEmpleado(Empleado empleadoParaGuardar);

    void borrarEmpleadoPorId(Long empleadoid);
}
