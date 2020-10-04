package edu.nps.moves.dis7.entities.usa.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7b4b8199
 * Country: United States of America (USA)
 * Entity kind: Life form
 * Domain: LAND
 *
 * Entity type uid: 32713
 */
public class _556mmM16A11 extends EntityType
{
    public _556mmM16A11()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)12); // uid 32711, U.S. Marine Corps (USMC)
        setSubCategory((byte)5); // uid 32712, Assault Rifles
        setSpecific((byte)40); // uid 32713, 5.56mm M16A1
    }
}
