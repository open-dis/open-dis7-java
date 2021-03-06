package edu.nps.moves.dis7.entities.chl.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6f195bc3;
 * Country: Chile (CHL);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27769
 */
public class FF05AlmiranteCochrane extends EntityType
{
    /** Default constructor */
    public FF05AlmiranteCochrane()
    {
        setCountry(Country.CHILE_CHL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 27464, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 27768, Cochrane Class
        setSpecific((byte)1); // uid 27769, FF-05 Almirante Cochrane
    }
}
