package edu.nps.moves.dis7.entities.jor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@21005f6c;
 * Country: Jordan (JOR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18265
 */
public class Han extends EntityType
{
    /** Default constructor */
    public Han()
    {
        setCountry(Country.JORDAN_JOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18262, Light/Patrol Craft
        setSubCategory((byte)1); // uid 18263, Faysal
        setSpecific((byte)2); // uid 18265, Han
    }
}
