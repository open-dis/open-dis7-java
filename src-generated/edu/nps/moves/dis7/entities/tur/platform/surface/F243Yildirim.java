package edu.nps.moves.dis7.entities.tur.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@518bfd90;
 * Country: Turkey (TUR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23263
 */
public class F243Yildirim extends EntityType
{
    /** Default constructor */
    public F243Yildirim()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 23253, Guided Missile Frigate (FFG)
        setSubCategory((byte)2); // uid 23259, Yavuz class
        setSpecific((byte)4); // uid 23263, F243 Yildirim
    }
}
