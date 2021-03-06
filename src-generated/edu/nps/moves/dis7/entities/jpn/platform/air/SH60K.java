package edu.nps.moves.dis7.entities.jpn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6731787b;
 * Country: Japan (JPN);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 33008
 */
public class SH60K extends EntityType
{
    /** Default constructor */
    public SH60K()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 33005, Anti-Submarine Warfare/Patrol Helicopter
        setSubCategory((byte)1); // uid 33006, Mitsubishi H-60
        setSpecific((byte)2); // uid 33008, SH-60K
    }
}
