package edu.nps.moves.dis7.entities.usa.munition.antisubmarine;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6cceb281
 * Country: United States of America (USA)
 * Entity kind: Munition
 * Domain: ANTI_SUBMARINE
 *
 * Entity type uid: 19802
 */
public class Mod21 extends EntityType
{
    public Mod21()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SUBMARINE));

        setCategory((byte)1); // uid 19775, Guided
        setSubCategory((byte)12); // uid 19801, NT 37F
        setSpecific((byte)1); // uid 19802, Mod 2
    }
}
