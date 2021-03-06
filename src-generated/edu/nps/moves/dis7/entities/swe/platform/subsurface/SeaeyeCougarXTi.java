package edu.nps.moves.dis7.entities.swe.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1229a2b7;
 * Country: Sweden (SWE);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 29281
 */
public class SeaeyeCougarXTi extends EntityType
{
    /** Default constructor */
    public SeaeyeCougarXTi()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)8); // uid 25264, Unmanned Underwater Vehicle (UUV)
        setSubCategory((byte)5); // uid 29274, SAAB Seaeye
        setSpecific((byte)7); // uid 29281, Seaeye Cougar XTi
    }
}
