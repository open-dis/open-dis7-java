package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@13c612bd;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31593
 */
public class GenericTruckPetroleumOilandLubricantsPOLSurveillance extends EntityType
{
    /** Default constructor */
    public GenericTruckPetroleumOilandLubricantsPOLSurveillance()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 24831, Single Unit Cargo Truck
        setSubCategory((byte)107); // uid 31593, Generic Truck, Petroleum, Oil, and Lubricants (POL), Surveillance
    }
}
