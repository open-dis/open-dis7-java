package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5d0a1059;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 24280
 */
public class TwinEngineTurboprop extends EntityType
{
    /** Default constructor */
    public TwinEngineTurboprop()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)86); // uid 24279, Civilian Fixed Wing Aircraft, Medium (up to 41,000 lbs / 18,597 kg)
        setSubCategory((byte)22); // uid 24280, Twin Engine Turboprop
    }
}
