package edu.nps.moves.dis7.entities.bhr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2ed94a8b;
 * Country: Bahrain (BHR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 32604
 */
public class F90Sabha extends EntityType
{
    /** Default constructor */
    public F90Sabha()
    {
        setCountry(Country.BAHRAIN_BHR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 32602, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 32603, Oliver Perry Class
        setSpecific((byte)1); // uid 32604, F90 Sabha
    }
}
