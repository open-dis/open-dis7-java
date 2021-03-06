package edu.nps.moves.dis7.entities.bmu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@337d0578;
 * Country: Bermuda (BMU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24500
 */
public class CornerBrook extends EntityType
{
    /** Default constructor */
    public CornerBrook()
    {
        setCountry(Country.BERMUDA_BMU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24498, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)3); // uid 24499, Container Ship
        setSpecific((byte)1); // uid 24500, Corner Brook
    }
}
