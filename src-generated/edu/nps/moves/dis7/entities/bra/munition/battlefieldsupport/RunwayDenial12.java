package edu.nps.moves.dis7.entities.bra.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@340cb97f;
 * Country: Brazil (BRA);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 21802
 */
public class RunwayDenial12 extends EntityType
{
    /** Default constructor */
    public RunwayDenial12()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21778, Ballistic
        setSubCategory((byte)1); // uid 21779, Rocket ASTROS
        setSpecific((byte)4); // uid 21796, 300 mm SS-80
        setExtra((byte)6); // uid 21802, Runway Denial
    }
}
