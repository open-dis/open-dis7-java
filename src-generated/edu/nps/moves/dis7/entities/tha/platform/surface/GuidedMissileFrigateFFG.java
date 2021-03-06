package edu.nps.moves.dis7.entities.tha.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@36c2b646;
 * Country: Thailand (THA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 19056
 */
public class GuidedMissileFrigateFFG extends EntityType
{
    /** Default constructor */
    public GuidedMissileFrigateFFG()
    {
        setCountry(Country.THAILAND_THA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 19056, Guided Missile Frigate (FFG)
    }
}
