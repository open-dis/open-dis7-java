package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@13bc8645
 * Country: Germany (DEU)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 25278
 */
public class _5DoorHatchbackEconomyCompactSmall extends EntityType
{
    public _5DoorHatchbackEconomyCompactSmall()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)81); // uid 24838, Car
        setSubCategory((byte)52); // uid 25278, 5-Door Hatchback, Economy/Compact (Small)
    }
}
