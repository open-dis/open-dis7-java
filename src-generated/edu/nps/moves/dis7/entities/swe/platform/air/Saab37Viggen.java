package edu.nps.moves.dis7.entities.swe.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@36417a54;
 * Country: Sweden (SWE);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 17494
 */
public class Saab37Viggen extends EntityType
{
    /** Default constructor */
    public Saab37Viggen()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 17492, Fighter/Air Defense
        setSubCategory((byte)2); // uid 17494, Saab 37 Viggen
    }
}
