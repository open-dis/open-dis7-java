package edu.nps.moves.dis7.entities.jpn.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2e0ad709;
 * Country: Japan (JPN);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 29031
 */
public class Type01LMAT extends EntityType
{
    /** Default constructor */
    public Type01LMAT()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)1); // uid 29030, Guided
        setSubCategory((byte)1); // uid 29031, Type 01 LMAT
    }
}
