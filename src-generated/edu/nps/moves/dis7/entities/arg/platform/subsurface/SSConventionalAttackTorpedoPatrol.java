package edu.nps.moves.dis7.entities.arg.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@2b05039f;
 * Country: Argentina (ARG);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 18761
 */
public class SSConventionalAttackTorpedoPatrol extends EntityType
{
    /** Default constructor */
    public SSConventionalAttackTorpedoPatrol()
    {
        setCountry(Country.ARGENTINA_ARG);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 18761, SS (Conventional Attack - Torpedo, Patrol
    }
}
