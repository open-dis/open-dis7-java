package edu.nps.moves.dis7.entities.usa.sensoremitter.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4ac19bc6;
 * Country: United States of America (USA);
 * Entity kind: Sensor/Emitter;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 25005
 */
public class MK84SUSSignalUnderwaterSound extends EntityType
{
    /** Default constructor */
    public MK84SUSSignalUnderwaterSound()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)10); // uid 22382, Acoustic, active
        setSubCategory((byte)77); // uid 22384, Sonobuoy
        setSpecific((byte)3); // uid 25005, MK 84 SUS (Signal Underwater Sound)
    }
}
