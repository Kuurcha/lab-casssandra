package org.example.api;

import org.example.crud.CrudService;

import org.example.model.cassandra.CassandraCasinoBuilding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("casinoBuilding")
public class CassandraController implements ControllerApi<CassandraCasinoBuilding>{

    @Autowired
    private CrudService<CassandraCasinoBuilding> crudCassandraService;
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @Override
    public UUID saveCasinoBuilding(@RequestBody CassandraCasinoBuilding casinoBuilding) {
        return crudCassandraService.saveBuilding(casinoBuilding).getId();
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    @Override
    public String deleteCasinoBuilding(@PathVariable UUID id) {
       return crudCassandraService.deleteBuilding(id);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @Override
    public CassandraCasinoBuilding findCasinoBuilding(@PathVariable UUID id) {
        return crudCassandraService.getBuilding(id);
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @Override
    public List<CassandraCasinoBuilding> findAllCasinoBuilding() {
        return  crudCassandraService.findAllBuildings();
    }

    @RequestMapping(value = "/echo", method = RequestMethod.POST)
    public String Hello1(@RequestBody String test) {
        return test;
    }

}
