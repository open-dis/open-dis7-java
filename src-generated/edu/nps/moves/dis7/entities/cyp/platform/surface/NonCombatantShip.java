package edu.nps.moves.dis7.entities.cyp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@79e2c065;
 * Country: Cyprus (CYP);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 19264
 */
public class NonCombatantShip extends EntityType
{
    /** Default constructor */
    public NonCombatantShip()
    {
        setCountry(Country.ACKNOWLEDGE_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)61); // uid 19264, Non-Combatant Ship
    }
}
