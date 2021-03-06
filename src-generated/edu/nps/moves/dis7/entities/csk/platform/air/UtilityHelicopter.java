package edu.nps.moves.dis7.entities.csk.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@6cf0e0ba;
 * Country: Czechoslovakia (CSK);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 25371
 */
public class UtilityHelicopter extends EntityType
{
    /** Default constructor */
    public UtilityHelicopter()
    {
        setCountry(Country.ACTION_REQUEST_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 25371, Utility Helicopter
    }
}
