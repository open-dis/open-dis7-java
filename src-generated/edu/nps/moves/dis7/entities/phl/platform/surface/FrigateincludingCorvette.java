package edu.nps.moves.dis7.entities.phl.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@1a78dacd;
 * Country: Philippines (PHL);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28420
 */
public class FrigateincludingCorvette extends EntityType
{
    /** Default constructor */
    public FrigateincludingCorvette()
    {
        setCountry(Country.PHILIPPINES_PHL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 28420, Frigate (including Corvette)
    }
}
