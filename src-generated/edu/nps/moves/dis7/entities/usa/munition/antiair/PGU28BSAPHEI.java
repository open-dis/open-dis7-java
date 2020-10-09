package edu.nps.moves.dis7.entities.usa.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7d88fa9c
 * Country: United States of America (USA)
 * Entity kind: Munition
 * Domain: ANTI_AIR
 *
 * Entity type uid: 19511
 */
public class PGU28BSAPHEI extends EntityType
{
    public PGU28BSAPHEI()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)2); // uid 19499, Ballistic
        setSubCategory((byte)3); // uid 19509, 20-mm
        setSpecific((byte)2); // uid 19511, PGU-28/B SAPHEI
    }
}
