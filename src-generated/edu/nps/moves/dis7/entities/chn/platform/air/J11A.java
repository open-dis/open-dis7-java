package edu.nps.moves.dis7.entities.chn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6a396c1e
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 24367
 */
public class J11A extends EntityType
{
    public J11A()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 16966, Fighter/Air Defense
        setSubCategory((byte)6); // uid 24365, Shenyang J-11 (Flanker B+)
        setSpecific((byte)2); // uid 24367, J-11A
    }
}
