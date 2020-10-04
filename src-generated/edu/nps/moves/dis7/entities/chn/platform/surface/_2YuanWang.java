package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@35ef1869
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 17375
 */
public class _2YuanWang extends EntityType
{
    public _2YuanWang()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 17367, Auxiliary, Merchant Marine
        setSubCategory((byte)3); // uid 17373, Yuan Wang class (space event)
        setSpecific((byte)2); // uid 17375, 2 Yuan Wang
    }
}
