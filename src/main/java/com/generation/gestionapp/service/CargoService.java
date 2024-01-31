package com.generation.gestionapp.service;

import com.generation.gestionapp.model.Cargo;

public interface CargoService {
    //en esta interfaz se declaran metodos
    //importar la clase
    Cargo guardarCargo(Cargo cargoParaGuardar);

    void borrarCargoPorId(Long cargoid);

}
