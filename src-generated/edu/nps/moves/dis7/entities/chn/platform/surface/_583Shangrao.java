package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@27ce24aa;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28434
 */
public class _583Shangrao extends EntityType
{
    /** Default constructor */
    public _583Shangrao()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 28428, Frigate (including Corvette)
        setSubCategory((byte)1); // uid 28429, Jiangdao Class (Type 056/Type 056A (ASW))
        setSpecific((byte)5); // uid 28434, 583 Shangrao
    }
}
