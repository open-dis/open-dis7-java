package edu.nps.moves.dis7.entities.oth.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@678586f0;
 * Country: Other;
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 32236
 */
public class DonkeyWithRider extends EntityType
{
    /** Default constructor */
    public DonkeyWithRider()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)200); // uid 32223, Mammal
        setSubCategory((byte)92); // uid 32236, Donkey With Rider
    }
}
