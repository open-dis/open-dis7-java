package edu.nps.moves.dis7.entities.ltu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4e4efc1b;
 * Country: Lithuania (LTU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27778
 */
public class FlyvefiskenClass extends EntityType
{
    /** Default constructor */
    public FlyvefiskenClass()
    {
        setCountry(Country.LITHUANIA_LTU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 27777, Light/Patrol Craft
        setSubCategory((byte)1); // uid 27778, Flyvefisken Class
    }
}
