package edu.nps.moves.dis7.entities.usa.munition.antiradar;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@203765b2;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: ANTI_RADAR;
 *
 * Entity type uid: 19676
 */
public class AGM45A extends EntityType
{
    /** Default constructor */
    public AGM45A()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_RADAR));

        setCategory((byte)1); // uid 19670, Guided
        setSubCategory((byte)2); // uid 19675, AGM-45 Shrike
        setSpecific((byte)1); // uid 19676, AGM-45A
    }
}
