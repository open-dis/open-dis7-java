package edu.nps.moves.dis7.entities.vnm.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@25791d40
 * Country: Viet Nam (VNM)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 27833
 */
public class HQ359 extends EntityType
{
    public HQ359()
    {
        setCountry(Country.VIET_NAM_VNM);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 27826, Light/Patrol Craft
        setSubCategory((byte)1); // uid 27827, Osa Class
        setSpecific((byte)6); // uid 27833, HQ-359
    }
}
