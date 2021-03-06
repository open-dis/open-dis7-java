package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3a94964;
 * Country: Japan (JPN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18904
 */
public class YubariClassFF extends EntityType
{
    /** Default constructor */
    public YubariClassFF()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 18902, Frigate (including Corvette)
        setSubCategory((byte)2); // uid 18904, Yubari Class (FF)
    }
}
