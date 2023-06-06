CREATE KEYSPACE ssau_cassandra
    WITH REPLICATION = {
        'class' : 'NetworkTopologyStrategy',
        'datacenter1': 1
    };

CREATE TABLE ssau_cassandra.casino_building(
    id UUID,
    casino_brand text,
    building_name   text,
    building_address text,
    income bigint,
    PRIMARY KEY(id)
);

INSERT INTO ssau_cassandra.casino_building(id, casino_brand, building_name, building_address, income)
    VALUES (uuid(), 'Lightning', 'OldHouse', 'Novo-sadovaya St. 666a', 4324324);

INSERT INTO ssau_cassandra.casino_building(id, casino_brand, building_name, building_address, income)
    VALUES (uuid(), 'Lightning', 'OldHouse', 'Novo-sadovaya St. 666b', 431224324);

INSERT INTO ssau_cassandra.casino_building(id, casino_brand, building_name, building_address, income)
    VALUES (uuid(), 'Darkness', 'NewHouse', 'Sleep St. 0', 43243234);

INSERT INTO ssau_cassandra.casino_building(id, casino_brand, building_name, building_address, income)
    VALUES (uuid(), 'Darkness', 'StudyHouse', 'Sleep St. -8', 124324);
