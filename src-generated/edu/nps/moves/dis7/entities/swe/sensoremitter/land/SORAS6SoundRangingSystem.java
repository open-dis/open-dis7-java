package edu.nps.moves.dis7.entities.swe.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@77e6761f
 * Country: Sweden (SWE)
 * Entity kind: Sensor/Emitter
 * Domain: LAND
 *
 * Entity type uid: 23708
 */
public class SORAS6SoundRangingSystem extends EntityType
{
    public SORAS6SoundRangingSystem()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 23706, Acoustic, Passive
        setSubCategory((byte)8); // uid 23707, Firing point/launch point location
        setSpecific((byte)1); // uid 23708, SORAS-6 Sound Ranging System
    }
}
