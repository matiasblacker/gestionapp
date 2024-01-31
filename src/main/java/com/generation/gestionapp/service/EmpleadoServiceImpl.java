package com.generation.gestionapp.service;

import com.generation.gestionapp.model.Empleado;
import com.generation.gestionapp.repository.EmpleadoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired //con esta notacion inyecto un componente dentro de esta clase
    private EmpleadoRepository empleadoRepository;

    //se genera el metodo
    @Override //sobreescribe y aplica polimorfismo
    public Empleado guardarEmpleado(Empleado empleadoParaGuardar) {
        Boolean empleadoExiste = empleadoRepository.existsById(empleadoParaGuardar.getEmpleadoId());

        //agrega validaciones antes de guardaral empleado
        if (!(empleadoExiste) && empleadoParaGuardar.getAniosAntiguedad() > 1){
            return empleadoRepository.save(empleadoParaGuardar);
        }else{
            return null;
        }
    }
    @Override
    public void borrarEmpleadoPorId(Long id) {
        //Validamos que el empleado existe
        Boolean empleadoExiste = empleadoRepository.existsById(id);

        if (empleadoExiste) {
            empleadoRepository.deleteById(id);
        }
    }
}
