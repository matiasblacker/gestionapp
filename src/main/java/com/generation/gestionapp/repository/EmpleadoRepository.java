package com.generation.gestionapp.repository;

import com.generation.gestionapp.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //indicar que es un repositorio
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> { //añadir la clase y el tipo de dato del id
    ///Hereda de JPAREpository que aporta metodos para realiazr CRUD, paginacion y orden.


}
