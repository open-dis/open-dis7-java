package edu.nps.moves.dis7.entities.usa.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7114e780
 * Country: United States of America (USA)
 * Entity kind: Munition
 * Domain: BATTLEFIELD_SUPPORT
 *
 * Entity type uid: 30306
 */
public class AGM158CLRASMBattlefieldSupportConfiguration extends EntityType
{
    public AGM158CLRASMBattlefieldSupportConfiguration()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)1); // uid 19887, Guided
        setSubCategory((byte)26); // uid 19968, AGM-158 Joint Air-to-Surface Standoff Missile (JASSM)
        setSpecific((byte)3); // uid 30306, AGM-158C LRASM (Battlefield Support Configuration)
    }
}