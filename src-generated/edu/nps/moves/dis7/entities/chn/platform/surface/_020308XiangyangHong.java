package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@55b7a4e0
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 17403
 */
public class _020308XiangyangHong extends EntityType
{
    public _020308XiangyangHong()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 17367, Auxiliary, Merchant Marine
        setSubCategory((byte)12); // uid 17399, Xing Fengshan class (intelligence collection)
        setSpecific((byte)4); // uid 17403, 02, 03, 08 Xiangyang Hong
    }
}
