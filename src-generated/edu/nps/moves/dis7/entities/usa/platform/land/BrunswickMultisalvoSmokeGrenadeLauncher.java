package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@619f2afc;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 10009
 */
public class BrunswickMultisalvoSmokeGrenadeLauncher extends EntityType
{
    /** Default constructor */
    public BrunswickMultisalvoSmokeGrenadeLauncher()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)0); // uid 10001, Other
        setSubCategory((byte)2); // uid 10007, Grenade launchers
        setSpecific((byte)2); // uid 10009, Brunswick Multisalvo Smoke Grenade Launcher
    }
}
