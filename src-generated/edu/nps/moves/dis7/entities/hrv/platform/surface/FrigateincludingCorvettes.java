package edu.nps.moves.dis7.entities.hrv.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@5158b42f;
 * Country: Croatia (HRV);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 19335
 */
public class FrigateincludingCorvettes extends EntityType
{
    /** Default constructor */
    public FrigateincludingCorvettes()
    {
        setCountry(Country.CROATIA_HRV);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 19335, Frigate (including Corvettes)
    }
}
