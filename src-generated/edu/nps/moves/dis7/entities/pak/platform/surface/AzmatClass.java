package edu.nps.moves.dis7.entities.pak.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@22d6cac2;
 * Country: Pakistan (PAK);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28448
 */
public class AzmatClass extends EntityType
{
    /** Default constructor */
    public AzmatClass()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 19339, Light/Patrol Craft
        setSubCategory((byte)4); // uid 28448, Azmat Class
    }
}
