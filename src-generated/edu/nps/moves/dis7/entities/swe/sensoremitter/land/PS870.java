package edu.nps.moves.dis7.entities.swe.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@42e202d7;
 * Country: Sweden (SWE);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 27276
 */
public class PS870 extends EntityType
{
    /** Default constructor */
    public PS870()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22547, RF Active
        setSubCategory((byte)5); // uid 22548, Target Acquisition Radar
        setSpecific((byte)4); // uid 27276, PS-870
    }
}
