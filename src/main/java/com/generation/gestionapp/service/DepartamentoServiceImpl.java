package com.generation.gestionapp.service;


import com.generation.gestionapp.model.Departamento;
import com.generation.gestionapp.repository.DepartamentoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DepartamentoServiceImpl implements DepartamentoService{

    @Autowired
    private DepartamentoRepository departamentoRepository;

    @Override
    public Departamento guardarDepartamento(Departamento departamentoParaGuardar) {

        Boolean departamentoExiste = departamentoRepository.existsById(departamentoParaGuardar.getDepartamentoId());

        if(!(departamentoExiste)){
            return departamentoRepository.save(departamentoParaGuardar);
        }else{
            return null;
        }
    }

    @Override
    public void borrarDepartamentoPorId(Long departamentoid) {
        Boolean departamentoExiste = departamentoRepository.existsById(departamentoid);

        if (departamentoExiste){
            departamentoRepository.deleteById(departamentoid);
        }
    }
}
