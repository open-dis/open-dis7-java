package edu.nps.moves.dis7.entities.yem.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3b4086c1;
 * Country: Yemen (YEM);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18740
 */
public class _14126September extends EntityType
{
    /** Default constructor */
    public _14126September()
    {
        setCountry(Country.YEMEN_YEM);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18738, Light/Patrol Craft
        setSubCategory((byte)1); // uid 18739, Broadsword Class (coastal patrol craft)
        setSpecific((byte)1); // uid 18740, 141 26 September
    }
}
