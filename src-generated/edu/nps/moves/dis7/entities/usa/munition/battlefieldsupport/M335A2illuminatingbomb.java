package edu.nps.moves.dis7.entities.usa.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2bb0e277;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 20124
 */
public class M335A2illuminatingbomb extends EntityType
{
    /** Default constructor */
    public M335A2illuminatingbomb()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 19971, Ballistic
        setSubCategory((byte)18); // uid 20118, 107 mm
        setSpecific((byte)6); // uid 20124, M335 A2 illuminating bomb
    }
}
