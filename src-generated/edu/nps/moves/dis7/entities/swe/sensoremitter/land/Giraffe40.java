package edu.nps.moves.dis7.entities.swe.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@4491eaeb;
 * Country: Sweden (SWE);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 22550
 */
public class Giraffe40 extends EntityType
{
    /** Default constructor */
    public Giraffe40()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22547, RF Active
        setSubCategory((byte)5); // uid 22548, Target Acquisition Radar
        setSpecific((byte)1); // uid 22549, Giraffe
        setExtra((byte)1); // uid 22550, Giraffe-40
    }
}
