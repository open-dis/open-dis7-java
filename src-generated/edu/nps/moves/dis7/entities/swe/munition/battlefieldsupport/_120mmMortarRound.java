package edu.nps.moves.dis7.entities.swe.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3a5e2525;
 * Country: Sweden (SWE);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 27643
 */
public class _120mmMortarRound extends EntityType
{
    /** Default constructor */
    public _120mmMortarRound()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21657, Ballistic
        setSubCategory((byte)11); // uid 27643, 120 mm (Mortar Round)
    }
}
