package edu.nps.moves.dis7.entities.usa.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@84f51d9;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 32064
 */
public class M821HEBomb extends EntityType
{
    /** Default constructor */
    public M821HEBomb()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 19971, Ballistic
        setSubCategory((byte)8); // uid 20027, 81 mm
        setSpecific((byte)24); // uid 32064, M821 HE Bomb
    }
}
