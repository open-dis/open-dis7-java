package edu.nps.moves.dis7.entities.oth.lifeform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@121ddca4;
 * Country: Other;
 * Entity kind: Life form;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 32273
 */
public class Dolphin extends EntityType
{
    /** Default constructor */
    public Dolphin()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)201); // uid 32270, Mammal
        setSubCategory((byte)50); // uid 32273, Dolphin
    }
}
