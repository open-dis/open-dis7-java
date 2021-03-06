package edu.nps.moves.dis7.entities.rus.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3350ab4;
 * Country: Russia (RUS);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 22409
 */
public class LandRadarHostileFixed extends EntityType
{
    /** Default constructor */
    public LandRadarHostileFixed()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 22408, Multi-spectral
        setSubCategory((byte)1); // uid 22409, Land Radar Hostile Fixed
    }
}
