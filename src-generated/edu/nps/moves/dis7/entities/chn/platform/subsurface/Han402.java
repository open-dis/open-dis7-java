package edu.nps.moves.dis7.entities.chn.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1d2adfbe
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Platform
 * Domain: SUBSURFACE
 *
 * Entity type uid: 17447
 */
public class Han402 extends EntityType
{
    public Han402()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)3); // uid 17444, SSN (Nuclear Attack - Torpedo)
        setSubCategory((byte)1); // uid 17445, Han Class (Type 091)
        setSpecific((byte)2); // uid 17447, Han 402
    }
}
