package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@180e6ac4
 * Country: Japan (JPN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 18895
 */
public class MinegumoClassDD extends EntityType
{
    public MinegumoClassDD()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)5); // uid 18890, Destroyer (DD)
        setSubCategory((byte)5); // uid 18895, Minegumo Class (DD)
    }
}
