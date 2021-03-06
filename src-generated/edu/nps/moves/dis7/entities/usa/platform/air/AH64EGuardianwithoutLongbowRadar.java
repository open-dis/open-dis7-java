package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7a8341c1;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 26665
 */
public class AH64EGuardianwithoutLongbowRadar extends EntityType
{
    /** Default constructor */
    public AH64EGuardianwithoutLongbowRadar()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)20); // uid 11056, Attack helicopter
        setSubCategory((byte)1); // uid 11057, McDonnell-Douglas AH-64 Apache
        setSpecific((byte)8); // uid 26665, AH-64E Guardian without Longbow Radar
    }
}
