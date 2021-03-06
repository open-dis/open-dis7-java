package edu.nps.moves.dis7.entities.phl.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@34448e6c;
 * Country: Philippines (PHL);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24561
 */
public class EasternEndeavor extends EntityType
{
    /** Default constructor */
    public EasternEndeavor()
    {
        setCountry(Country.PHILIPPINES_PHL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24559, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)1); // uid 24560, Common Dry Cargo Ship
        setSpecific((byte)1); // uid 24561, Eastern Endeavor
    }
}
