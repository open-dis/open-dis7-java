package edu.nps.moves.dis7.entities.oth.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7ba63fe5;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 24742
 */
public class GenericHybridAirship extends EntityType
{
    /** Default constructor */
    public GenericHybridAirship()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)101); // uid 24738, Civilian Lighter than Air, Airship
        setSubCategory((byte)4); // uid 24742, Generic Hybrid Airship
    }
}
