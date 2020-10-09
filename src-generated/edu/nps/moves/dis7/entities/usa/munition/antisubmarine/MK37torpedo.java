package edu.nps.moves.dis7.entities.usa.munition.antisubmarine;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3ac0a14b
 * Country: United States of America (USA)
 * Entity kind: Munition
 * Domain: ANTI_SUBMARINE
 *
 * Entity type uid: 19784
 */
public class MK37torpedo extends EntityType
{
    public MK37torpedo()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SUBMARINE));

        setCategory((byte)1); // uid 19775, Guided
        setSubCategory((byte)4); // uid 19784, MK37 torpedo
    }
}
