package edu.nps.moves.dis7.entities.usa.sensoremitter.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@4fafd27e
 * Country: United States of America (USA)
 * Entity kind: Sensor/Emitter
 * Domain: SURFACE
 *
 * Entity type uid: 22373
 */
public class Other extends EntityType
{
    public Other()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)0); // uid 22373, Other
    }
}
