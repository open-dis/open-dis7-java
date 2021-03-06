package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@d71adc2;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 25904
 */
public class GenericSkidSteer extends EntityType
{
    /** Default constructor */
    public GenericSkidSteer()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)87); // uid 25881, Construction Specialty Vehicle
        setSubCategory((byte)23); // uid 25904, Generic Skid Steer
    }
}
