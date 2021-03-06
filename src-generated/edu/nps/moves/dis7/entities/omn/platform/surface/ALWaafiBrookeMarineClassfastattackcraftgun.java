package edu.nps.moves.dis7.entities.omn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@588ab592;
 * Country: Oman (OMN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17945
 */
public class ALWaafiBrookeMarineClassfastattackcraftgun extends EntityType
{
    /** Default constructor */
    public ALWaafiBrookeMarineClassfastattackcraftgun()
    {
        setCountry(Country.OMAN_OMN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17942, Light/Patrol Craft
        setSubCategory((byte)2); // uid 17945, AL Waafi (Brooke Marine) Class (fast attack craft-gun)
    }
}
