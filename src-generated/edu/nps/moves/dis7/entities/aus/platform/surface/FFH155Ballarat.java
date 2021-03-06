package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1c2c22f3;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17519
 */
public class FFH155Ballarat extends EntityType
{
    /** Default constructor */
    public FFH155Ballarat()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 17511, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 17513, ANZAC Class (Meko 200)
        setSpecific((byte)6); // uid 17519, FFH 155 Ballarat
    }
}
