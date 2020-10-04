package edu.nps.moves.dis7.entities.omn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1bdaa23d
 * Country: Oman (OMN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 17961
 */
public class Q2 extends EntityType
{
    public Q2()
    {
        setCountry(Country.OMAN_OMN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17942, Light/Patrol Craft
        setSubCategory((byte)5); // uid 17960, Tyler-Vortex Type (inshore patrol craft)
        setSpecific((byte)1); // uid 17961, Q2
    }
}