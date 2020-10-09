package edu.nps.moves.dis7.entities.usa.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@b3fc6d8
 * Country: United States of America (USA)
 * Entity kind: Munition
 * Domain: ANTI_AIR
 *
 * Entity type uid: 19445
 */
public class RIM162B extends EntityType
{
    public RIM162B()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 19406, Guided
        setSubCategory((byte)12); // uid 19441, Sea Sparrow
        setSpecific((byte)2); // uid 19443, Evolved Sea Sparrow Missile (ESSM)
        setExtra((byte)2); // uid 19445, RIM-162B
    }
}
