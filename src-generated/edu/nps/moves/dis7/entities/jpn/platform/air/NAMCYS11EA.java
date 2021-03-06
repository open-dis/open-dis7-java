package edu.nps.moves.dis7.entities.jpn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4275c20c;
 * Country: Japan (JPN);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29183
 */
public class NAMCYS11EA extends EntityType
{
    /** Default constructor */
    public NAMCYS11EA()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)8); // uid 29182, Surveillance/C2 (Airborne Early Warning)
        setSubCategory((byte)1); // uid 29183, NAMC YS-11EA
    }
}
