package edu.nps.moves.dis7.entities.deu.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@49232c6f;
 * Country: Germany (DEU);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 21211
 */
public class Milanmissile extends EntityType
{
    /** Default constructor */
    public Milanmissile()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)1); // uid 21210, Guided
        setSubCategory((byte)1); // uid 21211, Milan missile
    }
}
