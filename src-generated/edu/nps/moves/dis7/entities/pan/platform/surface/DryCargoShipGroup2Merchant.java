package edu.nps.moves.dis7.entities.pan.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@c96a4ea
 * Country: Panama (PAN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 24545
 */
public class DryCargoShipGroup2Merchant extends EntityType
{
    public DryCargoShipGroup2Merchant()
    {
        setCountry(Country.PANAMA_PAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24545, Dry Cargo Ship (Group 2 Merchant)
    }
}
