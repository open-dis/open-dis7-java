package edu.nps.moves.dis7.entities.usa.munition.antiradar;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4cfcac13
 * Country: United States of America (USA)
 * Entity kind: Munition
 * Domain: ANTI_RADAR
 *
 * Entity type uid: 28231
 */
public class AGM88D extends EntityType
{
    public AGM88D()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_RADAR));

        setCategory((byte)1); // uid 19670, Guided
        setSubCategory((byte)1); // uid 19671, AGM-88 High-speed Anti-Radiation Missile (HARM)
        setSpecific((byte)4); // uid 28231, AGM-88D
    }
}
