package edu.nps.moves.dis7.entities.oth.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@642c72cf;
 * Country: Other;
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 32225
 */
public class MediumDog extends EntityType
{
    /** Default constructor */
    public MediumDog()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)200); // uid 32223, Mammal
        setSubCategory((byte)10); // uid 32225, Medium Dog
    }
}
