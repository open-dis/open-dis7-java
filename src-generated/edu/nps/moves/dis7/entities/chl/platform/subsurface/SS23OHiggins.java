package edu.nps.moves.dis7.entities.chl.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2c039ac6;
 * Country: Chile (CHL);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 26247
 */
public class SS23OHiggins extends EntityType
{
    /** Default constructor */
    public SS23OHiggins()
    {
        setCountry(Country.CHILE_CHL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 26245, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)1); // uid 26246, Scorpene Class
        setSpecific((byte)1); // uid 26247, SS-23 OHiggins
    }
}
