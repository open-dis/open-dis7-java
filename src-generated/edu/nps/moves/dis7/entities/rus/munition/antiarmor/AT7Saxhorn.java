package edu.nps.moves.dis7.entities.rus.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@401e02b4;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 20435
 */
public class AT7Saxhorn extends EntityType
{
    /** Default constructor */
    public AT7Saxhorn()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)1); // uid 20421, Guided
        setSubCategory((byte)9); // uid 20435, AT-7 Saxhorn
    }
}
