package edu.nps.moves.dis7.entities.bhs.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7a5d012c;
 * Country: Bahamas (BHS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24494
 */
public class Ramlah extends EntityType
{
    /** Default constructor */
    public Ramlah()
    {
        setCountry(Country.BAHAMAS_BHS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24486, Tanker (Group 3 Merchant)
        setSubCategory((byte)5); // uid 24487, Crude Oil Tanker (up to 159,999 DWT)
        setSpecific((byte)3); // uid 24494, Ramlah
    }
}
