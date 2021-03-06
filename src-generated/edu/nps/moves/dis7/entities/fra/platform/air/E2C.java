package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@101952da;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29836
 */
public class E2C extends EntityType
{
    /** Default constructor */
    public E2C()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)8); // uid 29834, Surveillance/C2 (Airborne Early Warning)
        setSubCategory((byte)1); // uid 29835, Grumman E-2 Hawkeye
        setSpecific((byte)1); // uid 29836, E-2C
    }
}
