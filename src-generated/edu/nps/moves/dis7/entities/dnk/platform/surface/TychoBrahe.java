package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7770f470
 * Country: Denmark (DNK)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 32962
 */
public class TychoBrahe extends EntityType
{
    public TychoBrahe()
    {
        setCountry(Country.DENMARK_DNK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)80); // uid 32951, Passenger Vessel (Group 1 Merchant)
        setSubCategory((byte)4); // uid 32961, Ferry
        setSpecific((byte)1); // uid 32962, Tycho Brahe
    }
}