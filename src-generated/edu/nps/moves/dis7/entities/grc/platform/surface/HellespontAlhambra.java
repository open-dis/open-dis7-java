package edu.nps.moves.dis7.entities.grc.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2f16c6b3;
 * Country: Greece (GRC);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24517
 */
public class HellespontAlhambra extends EntityType
{
    /** Default constructor */
    public HellespontAlhambra()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24512, Tanker (Group 3 Merchant)
        setSubCategory((byte)5); // uid 24513, Crude Oil Tanker (up to 159,999 DWT)
        setSpecific((byte)4); // uid 24517, Hellespont Alhambra
    }
}
