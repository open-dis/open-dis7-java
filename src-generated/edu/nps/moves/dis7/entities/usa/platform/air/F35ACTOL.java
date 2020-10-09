package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@29f38091
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 10821
 */
public class F35ACTOL extends EntityType
{
    public F35ACTOL()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 10755, Fighter/Air Defense
        setSubCategory((byte)12); // uid 10820, F-35 Joint Strike Fighter (JSF)
        setSpecific((byte)1); // uid 10821, F-35A CTOL
    }
}
