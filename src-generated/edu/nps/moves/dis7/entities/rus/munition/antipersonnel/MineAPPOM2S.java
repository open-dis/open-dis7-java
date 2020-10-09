package edu.nps.moves.dis7.entities.rus.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@79f5a6ed
 * Country: Russia (RUS)
 * Entity kind: Munition
 * Domain: ANTI_PERSONNEL
 *
 * Entity type uid: 26962
 */
public class MineAPPOM2S extends EntityType
{
    public MineAPPOM2S()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)3); // uid 20697, Fixed
        setSubCategory((byte)64); // uid 26962, Mine, AP, POM-2S
    }
}
