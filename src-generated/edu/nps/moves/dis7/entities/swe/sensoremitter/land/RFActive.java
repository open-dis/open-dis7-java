package edu.nps.moves.dis7.entities.swe.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@62158991;
 * Country: Sweden (SWE);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 22547
 */
public class RFActive extends EntityType
{
    /** Default constructor */
    public RFActive()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22547, RF Active
    }
}
