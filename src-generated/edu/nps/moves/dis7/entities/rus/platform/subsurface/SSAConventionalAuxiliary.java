package edu.nps.moves.dis7.entities.rus.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@524a2ffb;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 14812
 */
public class SSAConventionalAuxiliary extends EntityType
{
    /** Default constructor */
    public SSAConventionalAuxiliary()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)7); // uid 14812, SSA (Conventional Auxiliary)
    }
}
