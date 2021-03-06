package edu.nps.moves.dis7.entities.yem.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@56a4abd0;
 * Country: Yemen (YEM);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18744
 */
public class _1201Baklan extends EntityType
{
    /** Default constructor */
    public _1201Baklan()
    {
        setCountry(Country.YEMEN_YEM);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18738, Light/Patrol Craft
        setSubCategory((byte)2); // uid 18743, Baklan Class (PCF)
        setSpecific((byte)1); // uid 18744, 1201 Baklan
    }
}
