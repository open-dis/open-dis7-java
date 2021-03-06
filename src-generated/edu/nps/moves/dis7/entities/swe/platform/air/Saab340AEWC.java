package edu.nps.moves.dis7.entities.swe.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4b6d92e;
 * Country: Sweden (SWE);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 25600
 */
public class Saab340AEWC extends EntityType
{
    /** Default constructor */
    public Saab340AEWC()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)8); // uid 25599, Surveillance/C2 (Airborne Early Warning)
        setSubCategory((byte)1); // uid 25600, Saab 340 AEW&C
    }
}
