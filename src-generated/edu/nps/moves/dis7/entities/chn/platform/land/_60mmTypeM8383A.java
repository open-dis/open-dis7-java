package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6fb0d3ed;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 24093
 */
public class _60mmTypeM8383A extends EntityType
{
    /** Default constructor */
    public _60mmTypeM8383A()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)10); // uid 16933, Mortar
        setSubCategory((byte)4); // uid 24093, 60 mm Type M-83/83A
    }
}
