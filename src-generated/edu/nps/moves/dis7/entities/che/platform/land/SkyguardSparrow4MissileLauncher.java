package edu.nps.moves.dis7.entities.che.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@767a014e;
 * Country: Switzerland (CHE);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 26992
 */
public class SkyguardSparrow4MissileLauncher extends EntityType
{
    /** Default constructor */
    public SkyguardSparrow4MissileLauncher()
    {
        setCountry(Country.SWITZERLAND_CHE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 19039, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 19040, Oerlikon GDF Skyguard Skyshield System
        setSpecific((byte)2); // uid 26992, Skyguard-Sparrow 4 Missile Launcher
    }
}
