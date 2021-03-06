package edu.nps.moves.dis7.entities.usa.sensoremitter.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@73dbe25;
 * Country: United States of America (USA);
 * Entity kind: Sensor/Emitter;
 * Domain: SURFACE;
 *
 * Entity type uid: 22376
 */
public class ICEPICKGEOBUOY extends EntityType
{
    /** Default constructor */
    public ICEPICKGEOBUOY()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 22374, Acoustic, active
        setSubCategory((byte)77); // uid 22375, Sonobuoy
        setSpecific((byte)1); // uid 22376, ICEPICK (GEOBUOY)
    }
}
