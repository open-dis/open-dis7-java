package edu.nps.moves.dis7.entities.csk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@3349e9bb;
 * Country: Czechoslovakia (CSK);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27390
 */
public class AirCushionSurfaceEffect extends EntityType
{
    /** Default constructor */
    public AirCushionSurfaceEffect()
    {
        setCountry(Country.ACTION_REQUEST_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)15); // uid 27390, Air Cushion/Surface Effect
    }
}
