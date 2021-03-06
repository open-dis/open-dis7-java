package edu.nps.moves.dis7.entities.aus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3ada9e37;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29326
 */
public class MH60RSeahawk extends EntityType
{
    /** Default constructor */
    public MH60RSeahawk()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 29323, Anti-Submarine Warfare/Patrol Helicopter
        setSubCategory((byte)1); // uid 29324, Sikorsky S-70B
        setSpecific((byte)2); // uid 29326, MH-60R Seahawk
    }
}
