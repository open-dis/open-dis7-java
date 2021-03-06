package edu.nps.moves.dis7.entities.usa.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5a8dcfbb;
 * Country: United States of America (USA);
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 33048
 */
public class HandGuns1 extends EntityType
{
    /** Default constructor */
    public HandGuns1()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)12); // uid 32711, U.S. Marine Corps (USMC)
        setSubCategory((byte)80); // uid 33048, Hand Guns
    }
}
