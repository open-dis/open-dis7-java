package edu.nps.moves.dis7.entities.oth.lifeform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4afdfc0f;
 * Country: Other;
 * Entity kind: Life form;
 * Domain: AIR;
 *
 * Entity type uid: 32260
 */
public class Crow extends EntityType
{
    /** Default constructor */
    public Crow()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)200); // uid 32257, Bird
        setSubCategory((byte)41); // uid 32260, Crow
    }
}
