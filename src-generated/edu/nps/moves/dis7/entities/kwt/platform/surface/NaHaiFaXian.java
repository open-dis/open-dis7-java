package edu.nps.moves.dis7.entities.kwt.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@35d6ca49;
 * Country: Kuwait (KWT);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24442
 */
public class NaHaiFaXian extends EntityType
{
    /** Default constructor */
    public NaHaiFaXian()
    {
        setCountry(Country.KUWAIT_KWT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24440, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)3); // uid 24441, Container Ship
        setSpecific((byte)1); // uid 24442, Na Hai Fa Xian
    }
}
