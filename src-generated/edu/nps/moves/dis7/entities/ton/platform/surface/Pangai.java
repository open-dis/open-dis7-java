package edu.nps.moves.dis7.entities.ton.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@ec8f4b9;
 * Country: Tonga (TON);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 26720
 */
public class Pangai extends EntityType
{
    /** Default constructor */
    public Pangai()
    {
        setCountry(Country.TONGA_TON);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 26717, Light/Patrol Craft
        setSubCategory((byte)1); // uid 26718, Pacific Class Patrol Boat
        setSpecific((byte)2); // uid 26720, Pangai
    }
}
