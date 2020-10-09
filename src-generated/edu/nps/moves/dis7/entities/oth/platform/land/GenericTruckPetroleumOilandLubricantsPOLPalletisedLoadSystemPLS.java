package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@d71adc2
 * Country: Other
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 31592
 */
public class GenericTruckPetroleumOilandLubricantsPOLPalletisedLoadSystemPLS extends EntityType
{
    public GenericTruckPetroleumOilandLubricantsPOLPalletisedLoadSystemPLS()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 24831, Single Unit Cargo Truck
        setSubCategory((byte)106); // uid 31592, Generic Truck, Petroleum, Oil, and Lubricants (POL) Palletised Load System (PLS)
    }
}
