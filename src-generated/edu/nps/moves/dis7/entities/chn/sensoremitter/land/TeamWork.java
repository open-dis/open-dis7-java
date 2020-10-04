package edu.nps.moves.dis7.entities.chn.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@8549c5f
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Sensor/Emitter
 * Domain: LAND
 *
 * Entity type uid: 22523
 */
public class TeamWork extends EntityType
{
    public TeamWork()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22506, RF Active
        setSubCategory((byte)4); // uid 22522, Fire Control Radar
        setSpecific((byte)1); // uid 22523, Team Work
    }
}
