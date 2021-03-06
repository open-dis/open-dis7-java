package edu.nps.moves.dis7.entities.tuv.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@75d4a80f;
 * Country: Tuvalu (TUV);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 32549
 */
public class GuardianClassPacificPatrolBoatsPPBR extends EntityType
{
    /** Default constructor */
    public GuardianClassPacificPatrolBoatsPPBR()
    {
        setCountry(Country.TUVALU_TUV);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 26723, Light/Patrol Craft
        setSubCategory((byte)2); // uid 32549, Guardian Class, Pacific Patrol Boats (PPB-R)
    }
}
