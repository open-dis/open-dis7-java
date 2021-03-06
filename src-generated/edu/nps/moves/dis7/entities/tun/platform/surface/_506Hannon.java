package edu.nps.moves.dis7.entities.tun.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@97d0c06;
 * Country: Tunisia (TUN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27507
 */
public class _506Hannon extends EntityType
{
    /** Default constructor */
    public _506Hannon()
    {
        setCountry(Country.TUNISIA_TUN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 23006, Light/Patrol Craft
        setSubCategory((byte)4); // uid 27505, Albatros Class (Type 143/143B)
        setSpecific((byte)2); // uid 27507, 506 Hannon
    }
}
