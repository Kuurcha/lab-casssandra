package org.example.model.cassandra;

import org.example.model.CasinoBuilding;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table("casino_building")
public class CassandraCasinoBuilding extends CasinoBuilding {
    @PrimaryKey
    private UUID id;

    private String casino_brand;

    private String building_name;

    private String building_address;

    private long income;

    public CassandraCasinoBuilding() {
    }

    public CassandraCasinoBuilding(UUID id, String casino_brand, String building_name, String building_address, long income) {
        this.id = id;
        this.casino_brand = casino_brand;
        this.building_name = building_name;
        this.building_address = building_address;
        this.income = income;
    }

    public String getCasino_brand() {
        return casino_brand;
    }

    public void setCasino_brand(String casino_brand) {
        this.casino_brand = casino_brand;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getBuilding_name() {
        return building_name;
    }

    public void setBuilding_name(String building_name) {
        this.building_name = building_name;
    }

    public String getBuilding_address() {
        return building_address;
    }

    public void setBuilding_address(String building_address) {
        this.building_address = building_address;
    }

    public long getIncome() {
        return income;
    }

    public void setIncome(long income) {
        this.income = income;
    }
}
