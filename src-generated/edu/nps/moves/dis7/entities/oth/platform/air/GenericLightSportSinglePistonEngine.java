package edu.nps.moves.dis7.entities.oth.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@678040b3;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 24692
 */
public class GenericLightSportSinglePistonEngine extends EntityType
{
    /** Default constructor */
    public GenericLightSportSinglePistonEngine()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)84); // uid 24691, Civilian Fixed Wing Aircraft, Light Sport (up to 1320 lbs / 600 kg)
        setSubCategory((byte)11); // uid 24692, Generic Light Sport Single Piston Engine
    }
}
