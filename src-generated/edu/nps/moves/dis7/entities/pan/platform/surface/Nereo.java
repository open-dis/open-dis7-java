package edu.nps.moves.dis7.entities.pan.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@367795c7;
 * Country: Panama (PAN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24558
 */
public class Nereo extends EntityType
{
    /** Default constructor */
    public Nereo()
    {
        setCountry(Country.PANAMA_PAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24556, Tanker (Group 3 Merchant)
        setSubCategory((byte)5); // uid 24557, Crude Oil Tanker (up to 159,999 DWT)
        setSpecific((byte)1); // uid 24558, Nereo
    }
}
