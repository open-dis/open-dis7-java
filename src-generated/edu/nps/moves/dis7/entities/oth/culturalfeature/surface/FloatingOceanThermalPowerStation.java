package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@603d25db;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: SURFACE;
 *
 * Entity type uid: 29777
 */
public class FloatingOceanThermalPowerStation extends EntityType
{
    /** Default constructor */
    public FloatingOceanThermalPowerStation()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 29775, Electrical Power Installation
        setSubCategory((byte)1); // uid 29776, Ocean Thermal Power Station
        setSpecific((byte)1); // uid 29777, Floating Ocean Thermal Power Station
    }
}
