package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1ce61929;
 * Country: Japan (JPN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 26255
 */
public class TV3517ShirayukiexDD123Shirayuki extends EntityType
{
    /** Default constructor */
    public TV3517ShirayukiexDD123Shirayuki()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)5); // uid 18890, Destroyer (DD)
        setSubCategory((byte)4); // uid 18894, Hatsuyuki Class (DD)
        setSpecific((byte)2); // uid 26255, TV-3517 Shirayuki (ex-DD-123 Shirayuki )
    }
}
