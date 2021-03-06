package edu.nps.moves.dis7.entities.bra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@2a2d45ba;
 * Country: Brazil (BRA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 25696
 */
public class ASWPatrolObservation extends EntityType
{
    /** Default constructor */
    public ASWPatrolObservation()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)5); // uid 25696, ASW/Patrol/Observation
    }
}
