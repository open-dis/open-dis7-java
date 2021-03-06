package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4bdeaabb;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24420
 */
public class Athos extends EntityType
{
    /** Default constructor */
    public Athos()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24418, Tanker (Group 3 Merchant)
        setSubCategory((byte)5); // uid 24419, Crude Oil Tanker (up to 159,999 DWT)
        setSpecific((byte)1); // uid 24420, Athos
    }
}
