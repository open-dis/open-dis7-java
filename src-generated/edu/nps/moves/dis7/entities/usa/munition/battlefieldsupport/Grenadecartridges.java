package edu.nps.moves.dis7.entities.usa.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5835e24a;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 19991
 */
public class Grenadecartridges extends EntityType
{
    /** Default constructor */
    public Grenadecartridges()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 19971, Ballistic
        setSubCategory((byte)4); // uid 19990, 40 mm
        setSpecific((byte)1); // uid 19991, Grenade cartridges
    }
}
