package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1e643faf;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 29928
 */
public class Steber43NavalGeneralPurposeWorkboats extends EntityType
{
    /** Default constructor */
    public Steber43NavalGeneralPurposeWorkboats()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)18); // uid 29927, Utility
        setSubCategory((byte)1); // uid 29928, Steber 43 Naval General Purpose Workboats
    }
}
