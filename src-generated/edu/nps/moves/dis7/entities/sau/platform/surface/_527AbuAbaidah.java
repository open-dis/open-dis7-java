package edu.nps.moves.dis7.entities.sau.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@15dc339f;
 * Country: Saudi Arabia (SAU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17878
 */
public class _527AbuAbaidah extends EntityType
{
    /** Default constructor */
    public _527AbuAbaidah()
    {
        setCountry(Country.SAUDI_ARABIA_SAU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17862, Light/Patrol Craft
        setSubCategory((byte)4); // uid 17869, Al Siddiq (fast attack craft-missile)
        setSpecific((byte)9); // uid 17878, 527 Abu Abaidah
    }
}
