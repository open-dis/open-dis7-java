package edu.nps.moves.dis7.entities.usa.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@cd5ff55;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 20059
 */
public class M360AgentGB extends EntityType
{
    /** Default constructor */
    public M360AgentGB()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 19971, Ballistic
        setSubCategory((byte)10); // uid 20051, 105 mm
        setSpecific((byte)8); // uid 20059, M360 Agent GB
    }
}
