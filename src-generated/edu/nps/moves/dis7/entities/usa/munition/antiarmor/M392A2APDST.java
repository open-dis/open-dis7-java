package edu.nps.moves.dis7.entities.usa.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4b6b5352
 * Country: United States of America (USA)
 * Entity kind: Munition
 * Domain: ANTI_ARMOR
 *
 * Entity type uid: 19606
 */
public class M392A2APDST extends EntityType
{
    public M392A2APDST()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 19553, Ballistic
        setSubCategory((byte)10); // uid 19603, 105 mm
        setSpecific((byte)3); // uid 19606, M392A2 APDS-T
    }
}
