package edu.nps.moves.dis7.entities.chn.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@32eff876;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 24059
 */
public class _408ShangClass extends EntityType
{
    /** Default constructor */
    public _408ShangClass()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)3); // uid 17444, SSN (Nuclear Attack - Torpedo)
        setSubCategory((byte)2); // uid 24057, Shang Class (Type 093)
        setSpecific((byte)2); // uid 24059, 408 (Shang Class)
    }
}
