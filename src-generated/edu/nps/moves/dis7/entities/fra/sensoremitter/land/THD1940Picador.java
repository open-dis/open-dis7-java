package edu.nps.moves.dis7.entities.fra.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6231f77a;
 * Country: France (FRA);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 22485
 */
public class THD1940Picador extends EntityType
{
    /** Default constructor */
    public THD1940Picador()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22477, RF Active
        setSubCategory((byte)2); // uid 22481, Early Warning/Surveillance Radar
        setSpecific((byte)4); // uid 22485, THD 1940 (Picador)
    }
}
