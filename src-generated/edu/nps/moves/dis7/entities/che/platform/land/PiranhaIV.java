package edu.nps.moves.dis7.entities.che.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@433348bc;
 * Country: Switzerland (CHE);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 32949
 */
public class PiranhaIV extends EntityType
{
    /** Default constructor */
    public PiranhaIV()
    {
        setCountry(Country.SWITZERLAND_CHE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 32943, Armored Fighting Vehicle
        setSubCategory((byte)4); // uid 32949, Piranha IV
    }
}
