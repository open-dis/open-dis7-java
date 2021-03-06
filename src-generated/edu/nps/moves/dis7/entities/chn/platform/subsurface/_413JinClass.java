package edu.nps.moves.dis7.entities.chn.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@42e99e4a;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 27255
 */
public class _413JinClass extends EntityType
{
    /** Default constructor */
    public _413JinClass()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)1); // uid 17441, SSBN (Nuclear Ballistic Missile)
        setSubCategory((byte)2); // uid 27252, Jin Class (Type 094)
        setSpecific((byte)3); // uid 27255, 413 (Jin Class)
    }
}
