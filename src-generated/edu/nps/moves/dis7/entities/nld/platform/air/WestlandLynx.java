package edu.nps.moves.dis7.entities.nld.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7fe083b1;
 * Country: Netherlands (NLD);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 28198
 */
public class WestlandLynx extends EntityType
{
    /** Default constructor */
    public WestlandLynx()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 28197, Anti-Submarine Warfare/Patrol Helicopter
        setSubCategory((byte)1); // uid 28198, Westland Lynx
    }
}
