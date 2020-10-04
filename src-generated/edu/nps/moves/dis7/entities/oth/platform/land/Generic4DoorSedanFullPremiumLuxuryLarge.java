package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@c20be82
 * Country: Other
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 25772
 */
public class Generic4DoorSedanFullPremiumLuxuryLarge extends EntityType
{
    public Generic4DoorSedanFullPremiumLuxuryLarge()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)81); // uid 25754, Car
        setSubCategory((byte)44); // uid 25772, Generic 4-Door Sedan, Full/Premium/Luxury (Large)
    }
}
