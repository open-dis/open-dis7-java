package edu.nps.moves.dis7.entities.pol.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@323659f8;
 * Country: Poland (POL);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23082
 */
public class NonCombatantShip extends EntityType
{
    /** Default constructor */
    public NonCombatantShip()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)61); // uid 23082, Non-Combatant Ship
    }
}
