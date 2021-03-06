package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@645ba24a;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: LAND;
 *
 * Entity type uid: 22031
 */
public class HighTemperatureGascooledReactorHTGR extends EntityType
{
    /** Default constructor */
    public HighTemperatureGascooledReactorHTGR()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)12); // uid 22023, Nuclear Power Plant
        setSubCategory((byte)3); // uid 22031, High Temperature Gas-cooled Reactor (HTGR)
    }
}
