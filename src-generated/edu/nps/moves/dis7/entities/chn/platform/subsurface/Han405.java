package edu.nps.moves.dis7.entities.chn.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5fdcaa40;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 17450
 */
public class Han405 extends EntityType
{
    /** Default constructor */
    public Han405()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)3); // uid 17444, SSN (Nuclear Attack - Torpedo)
        setSubCategory((byte)1); // uid 17445, Han Class (Type 091)
        setSpecific((byte)5); // uid 17450, Han 405
    }
}
