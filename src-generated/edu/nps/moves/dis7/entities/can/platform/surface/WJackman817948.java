package edu.nps.moves.dis7.entities.can.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@bd8db5a;
 * Country: Canada (CAN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30980
 */
public class WJackman817948 extends EntityType
{
    /** Default constructor */
    public WJackman817948()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)63); // uid 26272, Coast Guard Boats
        setSubCategory((byte)2); // uid 30971, Arun-class lifeboat
        setSpecific((byte)9); // uid 30980, W. Jackman (817948)
    }
}
