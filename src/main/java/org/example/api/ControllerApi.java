package org.example.api;

import org.example.model.CasinoBuilding;

import java.util.List;
import java.util.UUID;

public interface ControllerApi <A extends CasinoBuilding> {

    UUID saveCasinoBuilding(A casinoBuilding);

    String deleteCasinoBuilding(UUID id);

    A findCasinoBuilding(UUID id);

    List<A> findAllCasinoBuilding();
}
