package edu.nps.moves.dis7.entities.bhs.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7f560810
 * Country: Bahamas (BHS)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 24493
 */
public class Mosocean extends EntityType
{
    public Mosocean()
    {
        setCountry(Country.BAHAMAS_BHS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24486, Tanker (Group 3 Merchant)
        setSubCategory((byte)5); // uid 24487, Crude Oil Tanker (up to 159,999 DWT)
        setSpecific((byte)2); // uid 24493, Mosocean
    }
}