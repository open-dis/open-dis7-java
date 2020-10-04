package edu.nps.moves.dis7.entities.oth.lifeform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@52d9d817
 * Country: Other
 * Entity kind: Life form
 * Domain: SUBSURFACE
 *
 * Entity type uid: 32278
 */
public class FloridaManatee extends EntityType
{
    public FloridaManatee()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)201); // uid 32270, Mammal
        setSubCategory((byte)161); // uid 32278, Florida Manatee
    }
}
