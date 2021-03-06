package edu.nps.moves.dis7.entities.swe.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1255de25;
 * Country: Sweden (SWE);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 23707
 */
public class Firingpointlaunchpointlocation extends EntityType
{
    /** Default constructor */
    public Firingpointlaunchpointlocation()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 23706, Acoustic, Passive
        setSubCategory((byte)8); // uid 23707, Firing point/launch point location
    }
}
