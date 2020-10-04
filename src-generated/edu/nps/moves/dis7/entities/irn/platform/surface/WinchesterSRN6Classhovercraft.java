package edu.nps.moves.dis7.entities.irn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@366c4480
 * Country: Iran (Islamic Republic of) (IRN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 18110
 */
public class WinchesterSRN6Classhovercraft extends EntityType
{
    public WinchesterSRN6Classhovercraft()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)15); // uid 18109, Air Cushion/Surface Effect
        setSubCategory((byte)1); // uid 18110, Winchester (SR. N6) Class (hovercraft)
    }
}
