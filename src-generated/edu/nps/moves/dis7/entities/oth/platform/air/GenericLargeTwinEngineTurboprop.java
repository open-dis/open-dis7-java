package edu.nps.moves.dis7.entities.oth.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@456abb66
 * Country: Other
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 24707
 */
public class GenericLargeTwinEngineTurboprop extends EntityType
{
    public GenericLargeTwinEngineTurboprop()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)87); // uid 24706, Civilian Fixed Wing Aircraft, Large (up to 255,000 lbs / 115,666 kg)
        setSubCategory((byte)22); // uid 24707, Generic Large Twin Engine Turboprop
    }
}