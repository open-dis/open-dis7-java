package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4b54af3d;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 13704
 */
public class Vikhrclass extends EntityType
{
    /** Default constructor */
    public Vikhrclass()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 13670, Light/Patrol craft
        setSubCategory((byte)21); // uid 13704, Vikhr class
    }
}
