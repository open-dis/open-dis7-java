package edu.nps.moves.dis7.entities.usa.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4dd1d2bb;
 * Country: United States of America (USA);
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 32708
 */
public class _84mmM136AT4CS extends EntityType
{
    /** Default constructor */
    public _84mmM136AT4CS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 32666, U.S. Army (USA)
        setSubCategory((byte)90); // uid 32707, Recoilless Rifles
        setSpecific((byte)15); // uid 32708, 84mm M136 AT-4 CS
    }
}
