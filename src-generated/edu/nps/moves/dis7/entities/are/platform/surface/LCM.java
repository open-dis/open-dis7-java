package edu.nps.moves.dis7.entities.are.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@43f1bb92;
 * Country: United Arab Emirates (ARE);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18720
 */
public class LCM extends EntityType
{
    /** Default constructor */
    public LCM()
    {
        setCountry(Country.UNITED_ARAB_EMIRATES_ARE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 18719, Landing Craft
        setSubCategory((byte)1); // uid 18720, LCM
    }
}
