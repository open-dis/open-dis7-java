package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@40ef3420;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30909
 */
public class HaiJing3383ex83 extends EntityType
{
    /** Default constructor */
    public HaiJing3383ex83()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)62); // uid 30899, Coast Guard Cutters
        setSubCategory((byte)3); // uid 30907, Shucha I WPS
        setSpecific((byte)2); // uid 30909, Hai Jing 3383 (ex-83)
    }
}
