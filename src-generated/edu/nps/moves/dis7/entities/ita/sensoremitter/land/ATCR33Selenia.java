package edu.nps.moves.dis7.entities.ita.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@727dcc64;
 * Country: Italy (ITA);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 22544
 */
public class ATCR33Selenia extends EntityType
{
    /** Default constructor */
    public ATCR33Selenia()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22538, RF Active
        setSubCategory((byte)2); // uid 22541, Early Warning/Surveillance Radar
        setSpecific((byte)3); // uid 22544, ATCR-33 (Selenia)
    }
}
