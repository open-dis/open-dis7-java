package edu.nps.moves.dis7.entities.usa.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@a69f9d;
 * Country: United States of America (USA);
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 33049
 */
public class _9mmBeretta92S92FSM91 extends EntityType
{
    /** Default constructor */
    public _9mmBeretta92S92FSM91()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)12); // uid 32711, U.S. Marine Corps (USMC)
        setSubCategory((byte)80); // uid 33048, Hand Guns
        setSpecific((byte)31); // uid 33049, 9mm Beretta 92S/92FS (M9)
    }
}
