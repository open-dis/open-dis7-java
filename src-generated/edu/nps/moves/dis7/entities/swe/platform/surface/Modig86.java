package edu.nps.moves.dis7.entities.swe.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5f038248;
 * Country: Sweden (SWE);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 26823
 */
public class Modig86 extends EntityType
{
    /** Default constructor */
    public Modig86()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17500, Light/Patrol Craft
        setSubCategory((byte)1); // uid 26817, Tapper Class
        setSpecific((byte)6); // uid 26823, Modig (86)
    }
}
