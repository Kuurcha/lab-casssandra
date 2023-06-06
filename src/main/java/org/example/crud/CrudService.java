package org.example.crud;


import org.example.model.CasinoBuilding;

import java.util.List;
import java.util.UUID;

public interface CrudService<A extends CasinoBuilding> {

    A saveBuilding(A Building);

    String deleteBuilding(UUID id);

    A getBuilding(UUID id);
    List<A> findAllBuildings();
}
