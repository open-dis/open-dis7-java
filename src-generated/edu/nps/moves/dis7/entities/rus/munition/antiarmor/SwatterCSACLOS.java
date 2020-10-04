package edu.nps.moves.dis7.entities.rus.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7af1d072
 * Country: Russia (RUS)
 * Entity kind: Munition
 * Domain: ANTI_ARMOR
 *
 * Entity type uid: 20427
 */
public class SwatterCSACLOS extends EntityType
{
    public SwatterCSACLOS()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)1); // uid 20421, Guided
        setSubCategory((byte)4); // uid 20425, AT-2 Swatter
        setSpecific((byte)2); // uid 20427, Swatter C (SACLOS)
    }
}
