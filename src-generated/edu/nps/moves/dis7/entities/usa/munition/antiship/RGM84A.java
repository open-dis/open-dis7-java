package edu.nps.moves.dis7.entities.usa.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3386c206;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: ANTI_SHIP;
 *
 * Entity type uid: 19693
 */
public class RGM84A extends EntityType
{
    /** Default constructor */
    public RGM84A()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 19689, Guided
        setSubCategory((byte)1); // uid 19690, Harpoon
        setSpecific((byte)3); // uid 19693, RGM-84A
    }
}
