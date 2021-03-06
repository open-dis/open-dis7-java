package edu.nps.moves.dis7.entities.tun.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@378cfecf;
 * Country: Tunisia (TUN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27506
 */
public class _505Hamilcar extends EntityType
{
    /** Default constructor */
    public _505Hamilcar()
    {
        setCountry(Country.TUNISIA_TUN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 23006, Light/Patrol Craft
        setSubCategory((byte)4); // uid 27505, Albatros Class (Type 143/143B)
        setSpecific((byte)1); // uid 27506, 505 Hamilcar
    }
}
