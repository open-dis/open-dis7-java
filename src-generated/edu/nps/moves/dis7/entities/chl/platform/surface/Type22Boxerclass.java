package edu.nps.moves.dis7.entities.chl.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1a1d6a08;
 * Country: Chile (CHL);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28687
 */
public class Type22Boxerclass extends EntityType
{
    /** Default constructor */
    public Type22Boxerclass()
    {
        setCountry(Country.CHILE_CHL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 27464, Guided Missile Frigate (FFG)
        setSubCategory((byte)4); // uid 28687, Type 22 (Boxer) class
    }
}
