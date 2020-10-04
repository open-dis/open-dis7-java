package edu.nps.moves.dis7.entities.bgr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@617faa95
 * Country: Bulgaria (BGR)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 28722
 */
public class AHM2001AntiHelicopterMineAHMSystem extends EntityType
{
    public AHM2001AntiHelicopterMineAHMSystem()
    {
        setCountry(Country.BULGARIA_BGR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 28720, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 28721, Anti-Helicopter Mine (AHM) System
        setSpecific((byte)1); // uid 28722, AHM-200-1 Anti-Helicopter Mine (AHM) System
    }
}
