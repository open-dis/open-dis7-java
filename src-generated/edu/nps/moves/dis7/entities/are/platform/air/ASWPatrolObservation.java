package edu.nps.moves.dis7.entities.are.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@1a22e0ef;
 * Country: United Arab Emirates (ARE);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 32007
 */
public class ASWPatrolObservation extends EntityType
{
    /** Default constructor */
    public ASWPatrolObservation()
    {
        setCountry(Country.UNITED_ARAB_EMIRATES_ARE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)5); // uid 32007, ASW/Patrol/Observation
    }
}
