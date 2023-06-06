package org.example.crud;

import org.example.model.cassandra.CassandraCasinoBuilding;
import org.example.repo.cassandra.CassandraCasinoBuildingRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CrudCassandraService extends AbstractCrudService<CassandraCasinoBuilding> {

    public CrudCassandraService( CassandraCasinoBuildingRepository сassandraCasinoBuildingRepository) {
        super(сassandraCasinoBuildingRepository);
    }


}
