package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3728a578;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 11043
 */
public class KE3AAWACSSaudiArabia extends EntityType
{
    /** Default constructor */
    public KE3AAWACSSaudiArabia()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)8); // uid 11029, Surveillance / C2 (Airborne Early Warning)
        setSubCategory((byte)4); // uid 11037, Boeing E-3 Sentry Airborne Warning and Control System (AWACS)
        setSpecific((byte)6); // uid 11043, KE-3A AWACS (Saudi Arabia)
    }
}
