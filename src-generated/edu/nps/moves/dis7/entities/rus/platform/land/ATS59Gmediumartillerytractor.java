package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@37c5fc56;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 12938
 */
public class ATS59Gmediumartillerytractor extends EntityType
{
    /** Default constructor */
    public ATS59Gmediumartillerytractor()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)8); // uid 12935, Small tracked utility vehicle
        setSubCategory((byte)3); // uid 12938, ATS-59G medium artillery tractor
    }
}
