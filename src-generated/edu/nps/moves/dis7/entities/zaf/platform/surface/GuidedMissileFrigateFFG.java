package edu.nps.moves.dis7.entities.zaf.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@25d2f66;
 * Country: South Africa (ZAF);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23104
 */
public class GuidedMissileFrigateFFG extends EntityType
{
    /** Default constructor */
    public GuidedMissileFrigateFFG()
    {
        setCountry(Country.SOUTH_AFRICA_ZAF);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 23104, Guided Missile Frigate (FFG)
    }
}
