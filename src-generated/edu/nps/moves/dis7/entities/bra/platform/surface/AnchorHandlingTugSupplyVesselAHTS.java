package edu.nps.moves.dis7.entities.bra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@685cb137;
 * Country: Brazil (BRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 31904
 */
public class AnchorHandlingTugSupplyVesselAHTS extends EntityType
{
    /** Default constructor */
    public AnchorHandlingTugSupplyVesselAHTS()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)83); // uid 31903, Support Vessel
        setSubCategory((byte)7); // uid 31904, Anchor Handling Tug Supply Vessel (AHTS)
    }
}
