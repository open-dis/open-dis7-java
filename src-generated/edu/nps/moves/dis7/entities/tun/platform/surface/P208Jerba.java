package edu.nps.moves.dis7.entities.tun.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@27d33393;
 * Country: Tunisia (TUN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23018
 */
public class P208Jerba extends EntityType
{
    /** Default constructor */
    public P208Jerba()
    {
        setCountry(Country.TUNISIA_TUN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 23006, Light/Patrol Craft
        setSubCategory((byte)3); // uid 23016, Modified Haizhui class
        setSpecific((byte)2); // uid 23018, P208 Jerba
    }
}
