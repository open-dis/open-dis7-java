package edu.nps.moves.dis7.entities.aus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@75828a0f;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29317
 */
public class FA18B extends EntityType
{
    /** Default constructor */
    public FA18B()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 29312, Fighter/Air Defense
        setSubCategory((byte)1); // uid 29315, McDonnell-Douglas F/A-18 Hornet
        setSpecific((byte)2); // uid 29317, F/A-18B
    }
}
