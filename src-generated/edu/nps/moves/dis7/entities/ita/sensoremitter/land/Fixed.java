package edu.nps.moves.dis7.entities.ita.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@236fd411;
 * Country: Italy (ITA);
 * Entity kind: Sensor/Emitter;
 * Domain: LAND;
 *
 * Entity type uid: 22540
 */
public class Fixed extends EntityType
{
    /** Default constructor */
    public Fixed()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22538, RF Active
        setSubCategory((byte)1); // uid 22539, Multi-function
        setSpecific((byte)1); // uid 22540, Fixed
    }
}
