package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@28eaa59a;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28438
 */
public class _587Jieyang extends EntityType
{
    /** Default constructor */
    public _587Jieyang()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 28428, Frigate (including Corvette)
        setSubCategory((byte)1); // uid 28429, Jiangdao Class (Type 056/Type 056A (ASW))
        setSpecific((byte)9); // uid 28438, 587 Jieyang
    }
}
