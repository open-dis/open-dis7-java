package edu.nps.moves.dis7.entities.rus.sensoremitter.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@25e6c22a;
 * Country: Russia (RUS);
 * Entity kind: Sensor/Emitter;
 * Domain: SURFACE;
 *
 * Entity type uid: 28224
 */
public class RGB48 extends EntityType
{
    /** Default constructor */
    public RGB48()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 28216, Acoustic, Passive
        setSubCategory((byte)77); // uid 28217, Sonobuoy
        setSpecific((byte)7); // uid 28224, RGB-48
    }
}
