package edu.nps.moves.dis7.entities.nzl.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@3aacf32a;
 * Country: New Zealand (NZL);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 31741
 */
public class GuidedMissileFrigateFFG extends EntityType
{
    /** Default constructor */
    public GuidedMissileFrigateFFG()
    {
        setCountry(Country.NEW_ZEALAND_NZL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 31741, Guided Missile Frigate (FFG)
    }
}
