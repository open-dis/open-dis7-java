package edu.nps.moves.dis7.entities.tur.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@38eb0f4d;
 * Country: Turkey (TUR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23260
 */
public class F240Yavuz extends EntityType
{
    /** Default constructor */
    public F240Yavuz()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 23253, Guided Missile Frigate (FFG)
        setSubCategory((byte)2); // uid 23259, Yavuz class
        setSpecific((byte)1); // uid 23260, F240 Yavuz
    }
}
