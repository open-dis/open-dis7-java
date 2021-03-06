package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@62010f5c;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30275
 */
public class _233mClass extends EntityType
{
    /** Default constructor */
    public _233mClass()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)100); // uid 30266, Search and Rescue Vessels
        setSubCategory((byte)4); // uid 30275, 23.3m Class
    }
}
