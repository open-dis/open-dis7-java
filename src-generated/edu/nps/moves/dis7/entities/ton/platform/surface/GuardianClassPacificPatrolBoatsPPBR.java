package edu.nps.moves.dis7.entities.ton.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7efb53af;
 * Country: Tonga (TON);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 32547
 */
public class GuardianClassPacificPatrolBoatsPPBR extends EntityType
{
    /** Default constructor */
    public GuardianClassPacificPatrolBoatsPPBR()
    {
        setCountry(Country.TONGA_TON);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 26717, Light/Patrol Craft
        setSubCategory((byte)2); // uid 32547, Guardian Class, Pacific Patrol Boats (PPB-R)
    }
}
