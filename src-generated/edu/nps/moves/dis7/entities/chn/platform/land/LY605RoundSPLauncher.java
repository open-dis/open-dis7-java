package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@16022d9d;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 16952
 */
public class LY605RoundSPLauncher extends EntityType
{
    /** Default constructor */
    public LY605RoundSPLauncher()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 16937, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)3); // uid 16950, LY-60 SAM System
        setSpecific((byte)2); // uid 16952, LY-60 5-Round SP Launcher
    }
}
