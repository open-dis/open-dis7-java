package edu.nps.moves.dis7.entities.cze.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@4550bb58;
 * Country: Czech Republic (CZE);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 30094
 */
public class UtilityHelicopter extends EntityType
{
    /** Default constructor */
    public UtilityHelicopter()
    {
        setCountry(Country.CZECH_REPUBLIC_CZE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 30094, Utility Helicopter
    }
}
