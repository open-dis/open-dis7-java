package edu.nps.moves.dis7.entities.zaf.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@78c1372d;
 * Country: South Africa (ZAF);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23107
 */
public class F146Isandlwana extends EntityType
{
    /** Default constructor */
    public F146Isandlwana()
    {
        setCountry(Country.SOUTH_AFRICA_ZAF);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 23104, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 23105, Valour class
        setSpecific((byte)2); // uid 23107, F146 Isandlwana
    }
}
