package edu.nps.moves.dis7.entities.bra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@28d25987;
 * Country: Brazil (BRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28685
 */
public class F48BosisioexBrazen extends EntityType
{
    /** Default constructor */
    public F48BosisioexBrazen()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 28675, Guided Missile Frigate (FFG)
        setSubCategory((byte)2); // uid 28683, Ex-Broadsword class
        setSpecific((byte)2); // uid 28685, F 48 Bosisio (ex-Brazen)
    }
}
