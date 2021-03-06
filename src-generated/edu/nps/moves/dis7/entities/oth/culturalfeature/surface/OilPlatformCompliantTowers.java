package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@cf10c92;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: SURFACE;
 *
 * Entity type uid: 25245
 */
public class OilPlatformCompliantTowers extends EntityType
{
    /** Default constructor */
    public OilPlatformCompliantTowers()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)1); // uid 22124, Oil Platform
        setSubCategory((byte)2); // uid 25245, Oil Platform, Compliant Towers
    }
}
