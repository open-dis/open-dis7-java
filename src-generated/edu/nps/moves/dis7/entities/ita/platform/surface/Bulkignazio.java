package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@47404bea;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24456
 */
public class Bulkignazio extends EntityType
{
    /** Default constructor */
    public Bulkignazio()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24454, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)3); // uid 24455, Container Ship
        setSpecific((byte)1); // uid 24456, Bulkignazio
    }
}
