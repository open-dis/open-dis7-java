package edu.nps.moves.dis7.entities.swe.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6c008c24;
 * Country: Sweden (SWE);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 25621
 */
public class SK37 extends EntityType
{
    /** Default constructor */
    public SK37()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 17492, Fighter/Air Defense
        setSubCategory((byte)2); // uid 17494, Saab 37 Viggen
        setSpecific((byte)2); // uid 25621, SK 37
    }
}
