package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@61a5b4ae;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 25847
 */
public class GenericPoliceSWAT extends EntityType
{
    /** Default constructor */
    public GenericPoliceSWAT()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)84); // uid 25837, Single Unit Utility/Emergency Truck
        setSubCategory((byte)21); // uid 25847, Generic Police, SWAT
    }
}
