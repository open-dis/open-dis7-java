package edu.nps.moves.dis7.entities.rus.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2e2f20b8
 * Country: Russia (RUS)
 * Entity kind: Munition
 * Domain: ANTI_SHIP
 *
 * Entity type uid: 20546
 */
public class SSN7Starbright extends EntityType
{
    public SSN7Starbright()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 20530, Guided
        setSubCategory((byte)9); // uid 20546, SS-N-7 Starbright
    }
}