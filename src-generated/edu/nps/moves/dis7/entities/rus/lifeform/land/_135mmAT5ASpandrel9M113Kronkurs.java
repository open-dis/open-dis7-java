package edu.nps.moves.dis7.entities.rus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@352e5a82;
 * Country: Russia (RUS);
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 32164
 */
public class _135mmAT5ASpandrel9M113Kronkurs extends EntityType
{
    /** Default constructor */
    public _135mmAT5ASpandrel9M113Kronkurs()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 32132, Army
        setSubCategory((byte)50); // uid 32156, Anti-Tank Missiles
        setSpecific((byte)181); // uid 32164, 135mm AT-5A Spandrel/9M113 Kronkurs
    }
}
