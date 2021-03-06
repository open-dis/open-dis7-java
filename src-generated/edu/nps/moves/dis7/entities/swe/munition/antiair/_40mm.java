package edu.nps.moves.dis7.entities.swe.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@83b0d0f;
 * Country: Sweden (SWE);
 * Entity kind: Munition;
 * Domain: ANTI_AIR;
 *
 * Entity type uid: 21642
 */
public class _40mm extends EntityType
{
    /** Default constructor */
    public _40mm()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)2); // uid 21641, Ballistic
        setSubCategory((byte)1); // uid 21642, 40 mm
    }
}
