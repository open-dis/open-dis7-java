package edu.nps.moves.dis7.entities.lby.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1b11ef33;
 * Country: Libya (LBY);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18920
 */
public class _542Laheeb extends EntityType
{
    /** Default constructor */
    public _542Laheeb()
    {
        setCountry(Country.LIBYA_LBY);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18918, Light/Patrol Craft (PC)
        setSubCategory((byte)1); // uid 18919, Combattante 2 G Class
        setSpecific((byte)1); // uid 18920, 542 Laheeb
    }
}
