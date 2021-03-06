package edu.nps.moves.dis7.entities.rus.sensoremitter.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6bf0f70a;
 * Country: Russia (RUS);
 * Entity kind: Sensor/Emitter;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 26684
 */
public class RGB55 extends EntityType
{
    /** Default constructor */
    public RGB55()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)10); // uid 22458, Acoustic, active
        setSubCategory((byte)77); // uid 26683, Sonobuoy
        setSpecific((byte)1); // uid 26684, RGB-55
    }
}
