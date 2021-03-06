package edu.nps.moves.dis7.entities.pak.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2c47a053;
 * Country: Pakistan (PAK);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 21746
 */
public class Hatf1 extends EntityType
{
    /** Default constructor */
    public Hatf1()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21745, Ballistic
        setSubCategory((byte)1); // uid 21746, Hatf-1
    }
}
