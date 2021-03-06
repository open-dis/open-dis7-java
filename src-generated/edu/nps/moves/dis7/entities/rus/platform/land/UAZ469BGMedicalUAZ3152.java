package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7c211fd0;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 26674
 */
public class UAZ469BGMedicalUAZ3152 extends EntityType
{
    /** Default constructor */
    public UAZ469BGMedicalUAZ3152()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 12854, Small Wheeled Utility Vehicle
        setSubCategory((byte)2); // uid 12857, UAZ-469B (UAZ-31512)
        setSpecific((byte)3); // uid 26674, UAZ-469BG Medical (UAZ-3152)
    }
}
