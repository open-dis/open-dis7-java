package edu.nps.moves.dis7.entities.esp.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2412a42b;
 * Country: Spain (ESP);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 24130
 */
public class Pegaso3046Technical extends EntityType
{
    /** Default constructor */
    public Pegaso3046Technical()
    {
        setCountry(Country.SPAIN_ESP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 24128, Small Wheeled Utility Vehicle - (0-1.25 tons)
        setSubCategory((byte)1); // uid 24129, Pegaso 3046
        setSpecific((byte)1); // uid 24130, Pegaso 3046 Technical
    }
}
