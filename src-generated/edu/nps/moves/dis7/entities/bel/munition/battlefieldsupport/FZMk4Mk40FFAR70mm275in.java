package edu.nps.moves.dis7.entities.bel.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@79ecc507;
 * Country: Belgium (BEL);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 30332
 */
public class FZMk4Mk40FFAR70mm275in extends EntityType
{
    /** Default constructor */
    public FZMk4Mk40FFAR70mm275in()
    {
        setCountry(Country.BELGIUM_BEL);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 30331, Ballistic
        setSubCategory((byte)1); // uid 30332, FZ Mk4/Mk40 FFAR (70 mm, 2.75 in)
    }
}
