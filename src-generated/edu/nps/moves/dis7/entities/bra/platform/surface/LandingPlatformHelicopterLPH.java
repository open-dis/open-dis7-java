package edu.nps.moves.dis7.entities.bra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@68c4039c;
 * Country: Brazil (BRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 32011
 */
public class LandingPlatformHelicopterLPH extends EntityType
{
    /** Default constructor */
    public LandingPlatformHelicopterLPH()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)54); // uid 32010, Amphibious Assault Ship
        setSubCategory((byte)1); // uid 32011, Landing Platform Helicopter (LPH)
    }
}
