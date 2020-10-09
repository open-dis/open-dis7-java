package edu.nps.moves.dis7.entities.vnm.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@4966bab1
 * Country: Viet Nam (VNM)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 28602
 */
public class GuidedMissileFrigateFFG extends EntityType
{
    public GuidedMissileFrigateFFG()
    {
        setCountry(Country.VIET_NAM_VNM);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 28602, Guided Missile Frigate (FFG)
    }
}
