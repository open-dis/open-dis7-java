package edu.nps.moves.dis7.entities.bra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3bfdc050;
 * Country: Brazil (BRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 31791
 */
public class CastillodeTebra extends EntityType
{
    /** Default constructor */
    public CastillodeTebra()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 31789, Tanker (Group 3 Merchant)
        setSubCategory((byte)2); // uid 31790, Chemical Tanker
        setSpecific((byte)1); // uid 31791, Castillo de Tebra
    }
}
