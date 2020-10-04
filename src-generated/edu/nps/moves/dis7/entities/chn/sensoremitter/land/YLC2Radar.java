package edu.nps.moves.dis7.entities.chn.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2f6f4ac4
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Sensor/Emitter
 * Domain: LAND
 *
 * Entity type uid: 31716
 */
public class YLC2Radar extends EntityType
{
    public YLC2Radar()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22506, RF Active
        setSubCategory((byte)2); // uid 22510, Early Warning / Surveillance Radar
        setSpecific((byte)15); // uid 31716, YLC-2 Radar
    }
}
