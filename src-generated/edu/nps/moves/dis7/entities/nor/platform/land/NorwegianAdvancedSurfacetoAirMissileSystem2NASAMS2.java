package edu.nps.moves.dis7.entities.nor.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5ed190be;
 * Country: Norway (NOR);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 30282
 */
public class NorwegianAdvancedSurfacetoAirMissileSystem2NASAMS2 extends EntityType
{
    /** Default constructor */
    public NorwegianAdvancedSurfacetoAirMissileSystem2NASAMS2()
    {
        setCountry(Country.NORWAY_NOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 30278, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)2); // uid 30282, Norwegian Advanced Surface to Air Missile System 2 (NASAMS 2)
    }
}
