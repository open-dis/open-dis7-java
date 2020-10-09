package edu.nps.moves.dis7.entities.usa.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@52ca0ad4
 * Country: United States of America (USA)
 * Entity kind: Munition
 * Domain: ANTI_ARMOR
 *
 * Entity type uid: 25298
 */
public class AGM114L5RFHOJ extends EntityType
{
    public AGM114L5RFHOJ()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)1); // uid 19519, Guided
        setSubCategory((byte)3); // uid 19530, AGM-114 Hellfire
        setSpecific((byte)9); // uid 25298, AGM-114L5, RF HOJ
    }
}
