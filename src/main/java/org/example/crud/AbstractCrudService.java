package org.example.crud;


import org.example.model.CasinoBuilding;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public abstract class AbstractCrudService<A extends CasinoBuilding> implements CrudService<A>{

    private final static String OK = "OK";

    private final CrudRepository<A, UUID> casinoBuildingRepo;
    
    public AbstractCrudService( CrudRepository<A,UUID> casinoBuildingRepo) {;
        this.casinoBuildingRepo = casinoBuildingRepo;
    }
    @Override
    public A saveBuilding(A Building){
        return casinoBuildingRepo.save(Building);
    }
    @Override
    public String deleteBuilding(UUID id){
        casinoBuildingRepo.deleteById(id);
        return OK;
    }
    @Override
    public A getBuilding(UUID id){
       return casinoBuildingRepo.findById(id).orElse(null);
    }
    @Override
    public List<A> findAllBuildings(){
        Iterable<A> iterable = casinoBuildingRepo.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                .collect(Collectors.toList());
    }

}
