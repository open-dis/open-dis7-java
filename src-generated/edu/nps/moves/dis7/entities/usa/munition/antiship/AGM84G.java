package edu.nps.moves.dis7.entities.usa.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4c6bba7d;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: ANTI_SHIP;
 *
 * Entity type uid: 19706
 */
public class AGM84G extends EntityType
{
    /** Default constructor */
    public AGM84G()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 19689, Guided
        setSubCategory((byte)1); // uid 19690, Harpoon
        setSpecific((byte)16); // uid 19706, AGM-84G
    }
}
