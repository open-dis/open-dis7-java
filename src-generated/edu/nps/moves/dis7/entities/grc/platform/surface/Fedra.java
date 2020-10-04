package edu.nps.moves.dis7.entities.grc.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@535779e4
 * Country: Greece (GRC)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 24511
 */
public class Fedra extends EntityType
{
    public Fedra()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24508, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)3); // uid 24509, Container Ship
        setSpecific((byte)2); // uid 24511, Fedra
    }
}
