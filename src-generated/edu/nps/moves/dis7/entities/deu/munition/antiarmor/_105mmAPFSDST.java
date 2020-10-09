package edu.nps.moves.dis7.entities.deu.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7ea42c82
 * Country: Germany (DEU)
 * Entity kind: Munition
 * Domain: ANTI_ARMOR
 *
 * Entity type uid: 21218
 */
public class _105mmAPFSDST extends EntityType
{
    public _105mmAPFSDST()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 21215, Ballistic
        setSubCategory((byte)3); // uid 21218, 105-mm APFSDS-T
    }
}
