package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@c4c0b41
 * Country: Russia (RUS)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 12939
 */
public class ATS59mediumartillerytractor extends EntityType
{
    public ATS59mediumartillerytractor()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)8); // uid 12935, Small tracked utility vehicle
        setSubCategory((byte)4); // uid 12939, ATS-59 medium artillery tractor
    }
}
