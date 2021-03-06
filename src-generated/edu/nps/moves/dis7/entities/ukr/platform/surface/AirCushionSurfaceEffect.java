package edu.nps.moves.dis7.entities.ukr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@1a1f5f71;
 * Country: Ukraine (UKR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28800
 */
public class AirCushionSurfaceEffect extends EntityType
{
    /** Default constructor */
    public AirCushionSurfaceEffect()
    {
        setCountry(Country.UKRAINE_UKR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)15); // uid 28800, Air Cushion/Surface Effect
    }
}
