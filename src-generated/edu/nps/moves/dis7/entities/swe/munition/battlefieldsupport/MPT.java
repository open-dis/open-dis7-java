package edu.nps.moves.dis7.entities.swe.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@61ab6521;
 * Country: Sweden (SWE);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 21660
 */
public class MPT extends EntityType
{
    /** Default constructor */
    public MPT()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21657, Ballistic
        setSubCategory((byte)1); // uid 21658, 40 mm
        setSpecific((byte)2); // uid 21660, MP-T
    }
}
