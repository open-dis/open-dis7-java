package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@24273305;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17516
 */
public class FFH152Warumungu extends EntityType
{
    /** Default constructor */
    public FFH152Warumungu()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 17511, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 17513, ANZAC Class (Meko 200)
        setSpecific((byte)3); // uid 17516, FFH 152 Warumungu
    }
}
