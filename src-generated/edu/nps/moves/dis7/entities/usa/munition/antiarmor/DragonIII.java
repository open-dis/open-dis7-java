package edu.nps.moves.dis7.entities.usa.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@56ec6960
 * Country: United States of America (USA)
 * Entity kind: Munition
 * Domain: ANTI_ARMOR
 *
 * Entity type uid: 19529
 */
public class DragonIII extends EntityType
{
    public DragonIII()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)1); // uid 19519, Guided
        setSubCategory((byte)2); // uid 19526, Dragon ATGW
        setSpecific((byte)3); // uid 19529, Dragon III
    }
}
