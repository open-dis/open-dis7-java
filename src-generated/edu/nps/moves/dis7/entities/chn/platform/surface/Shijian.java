package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3e2e18f2;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17377
 */
public class Shijian extends EntityType
{
    /** Default constructor */
    public Shijian()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 17367, Auxiliary, Merchant Marine
        setSubCategory((byte)4); // uid 17376, Shijian class (oceanographic research)
        setSpecific((byte)1); // uid 17377, Shijian
    }
}
