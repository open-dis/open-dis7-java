package edu.nps.moves.dis7.entities.bgr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4dfa3a9d;
 * Country: Bulgaria (BGR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27884
 */
public class OsaIIClass106 extends EntityType
{
    /** Default constructor */
    public OsaIIClass106()
    {
        setCountry(Country.BULGARIA_BGR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 27878, Light/Patrol Craft
        setSubCategory((byte)1); // uid 27879, Osa II Class
        setSpecific((byte)5); // uid 27884, 106
    }
}
