package edu.nps.moves.dis7.entities.chn.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3349e9bb
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Platform
 * Domain: SUBSURFACE
 *
 * Entity type uid: 28649
 */
public class _341YuanClass extends EntityType
{
    public _341YuanClass()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 17451, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)4); // uid 28637, Yuan Class (Type 039A / Type 041)
        setSpecific((byte)12); // uid 28649, 341 (Yuan Class)
    }
}
