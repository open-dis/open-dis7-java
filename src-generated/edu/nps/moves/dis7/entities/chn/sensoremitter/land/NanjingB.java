package edu.nps.moves.dis7.entities.chn.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@75a9cc24
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Sensor/Emitter
 * Domain: LAND
 *
 * Entity type uid: 22518
 */
public class NanjingB extends EntityType
{
    public NanjingB()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22506, RF Active
        setSubCategory((byte)2); // uid 22510, Early Warning / Surveillance Radar
        setSpecific((byte)6); // uid 22517, Nanjing B/C
        setExtra((byte)1); // uid 22518, Nanjing B
    }
}
