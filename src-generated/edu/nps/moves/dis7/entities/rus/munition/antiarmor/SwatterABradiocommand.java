package edu.nps.moves.dis7.entities.rus.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7ac48f05
 * Country: Russia (RUS)
 * Entity kind: Munition
 * Domain: ANTI_ARMOR
 *
 * Entity type uid: 20426
 */
public class SwatterABradiocommand extends EntityType
{
    public SwatterABradiocommand()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)1); // uid 20421, Guided
        setSubCategory((byte)4); // uid 20425, AT-2 Swatter
        setSpecific((byte)1); // uid 20426, Swatter A/B (radio command)
    }
}
