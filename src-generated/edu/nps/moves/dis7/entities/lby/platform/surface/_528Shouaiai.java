package edu.nps.moves.dis7.entities.lby.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2f2bf0e2;
 * Country: Libya (LBY);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27797
 */
public class _528Shouaiai extends EntityType
{
    /** Default constructor */
    public _528Shouaiai()
    {
        setCountry(Country.LIBYA_LBY);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18918, Light/Patrol Craft (PC)
        setSubCategory((byte)1); // uid 18919, Combattante 2 G Class
        setSpecific((byte)5); // uid 27797, 528 Shouaiai
    }
}
