package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@16f7c8c1;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 16923
 */
public class HY1CSSC2Silkwormlauncher extends EntityType
{
    /** Default constructor */
    public HY1CSSC2Silkwormlauncher()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 16904, Towed Artillery
        setSubCategory((byte)16); // uid 16922, HY-series ASCM launcher
        setSpecific((byte)1); // uid 16923, HY-1/CSSC-2 Silkworm launcher
    }
}
