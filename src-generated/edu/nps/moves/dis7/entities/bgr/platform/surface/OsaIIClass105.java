package edu.nps.moves.dis7.entities.bgr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@146ba0ac;
 * Country: Bulgaria (BGR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27883
 */
public class OsaIIClass105 extends EntityType
{
    /** Default constructor */
    public OsaIIClass105()
    {
        setCountry(Country.BULGARIA_BGR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 27878, Light/Patrol Craft
        setSubCategory((byte)1); // uid 27879, Osa II Class
        setSpecific((byte)4); // uid 27883, 105
    }
}
