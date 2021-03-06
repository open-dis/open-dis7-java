package edu.nps.moves.dis7.entities.ita.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3b2c0e88;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 18326
 */
public class AS61 extends EntityType
{
    /** Default constructor */
    public AS61()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 18324, Anti-Submarine Warfare/Patrol Helicopter
        setSubCategory((byte)2); // uid 18326, AS-61
    }
}
