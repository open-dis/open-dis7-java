package edu.nps.moves.dis7.entities.usa.munition.antiguidedweapon;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7e2bc2f4
 * Country: United States of America (USA)
 * Entity kind: Munition
 * Domain: ANTI_GUIDED_WEAPON
 *
 * Entity type uid: 19666
 */
public class Mk57MOSS extends EntityType
{
    public Mk57MOSS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_GUIDED_WEAPON));

        setCategory((byte)1); // uid 19663, Guided
        setSubCategory((byte)1); // uid 19664, Decoys
        setSpecific((byte)2); // uid 19666, Mk-57 (MOSS)
    }
}
