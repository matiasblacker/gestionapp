package com.generation.gestionapp.service;


import com.generation.gestionapp.model.Cargo;
import com.generation.gestionapp.repository.CargoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CargoServiceImpl implements CargoService{

    @Autowired //con esta notacion inyecto un componente dentro de esta clase
    private CargoRepository cargoRepository;

    @Override
    public Cargo guardarCargo(Cargo cargoParaGuardar){
        Boolean cargoExiste = cargoRepository.existsById(cargoParaGuardar.getCargoId());

        if(!(cargoExiste)){
            return cargoRepository.save(cargoParaGuardar);
        }else{
            return null;
        }
    }

    @Override
    public void borrarCargoPorId(Long cargoid) {
        Boolean cargoExiste = cargoRepository.existsById(cargoid);

        if (cargoExiste) {
            cargoRepository.deleteById(cargoid);
        }
    }
}
