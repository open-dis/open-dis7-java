package edu.nps.moves.dis7.entities.rou.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@75b21c3b;
 * Country: Romania (ROU);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 27820
 */
public class _521Delfinul extends EntityType
{
    /** Default constructor */
    public _521Delfinul()
    {
        setCountry(Country.ROMANIA_ROU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 27818, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)1); // uid 27819, Kilo Class
        setSpecific((byte)1); // uid 27820, 521 Delfinul
    }
}
