package org.example.repo.cassandra;

import org.example.model.cassandra.CassandraCasinoBuilding;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface CassandraCasinoBuildingRepository extends CassandraRepository<CassandraCasinoBuilding, UUID> {
}
