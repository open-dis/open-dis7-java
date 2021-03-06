package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1851c7d2;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: SURFACE;
 *
 * Entity type uid: 25250
 */
public class OilPlatformTensionLegPlatformTLP extends EntityType
{
    /** Default constructor */
    public OilPlatformTensionLegPlatformTLP()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)1); // uid 22124, Oil Platform
        setSubCategory((byte)7); // uid 25250, Oil Platform, Tension-Leg Platform (TLP)
    }
}
