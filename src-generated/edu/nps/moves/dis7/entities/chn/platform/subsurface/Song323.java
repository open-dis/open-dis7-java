package edu.nps.moves.dis7.entities.chn.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@9597028
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Platform
 * Domain: SUBSURFACE
 *
 * Entity type uid: 17466
 */
public class Song323 extends EntityType
{
    public Song323()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 17451, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)2); // uid 17462, Song Class (Type 039) (SSG)
        setSpecific((byte)4); // uid 17466, Song 323
    }
}