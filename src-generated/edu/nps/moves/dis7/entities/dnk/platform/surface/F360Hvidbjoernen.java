package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7c7a06ec;
 * Country: Denmark (DNK);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 25440
 */
public class F360Hvidbjoernen extends EntityType
{
    /** Default constructor */
    public F360Hvidbjoernen()
    {
        setCountry(Country.ACTION_RESPONSE_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 25435, Frigate (including Corvette)
        setSubCategory((byte)1); // uid 25436, Thetis Class
        setSpecific((byte)4); // uid 25440, F360 Hvidbjoernen
    }
}
