package edu.nps.moves.dis7.entities.jpn.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@186978a6;
 * Country: Japan (JPN);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 26995
 */
public class HayashioSS585TSS3606 extends EntityType
{
    /** Default constructor */
    public HayashioSS585TSS3606()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 18910, SS (Conventional Attack-Torpedo Patrol)
        setSubCategory((byte)1); // uid 18911, Harushio Class (SS)
        setSpecific((byte)3); // uid 26995, Hayashio SS-585/TSS-3606
    }
}
