package edu.nps.moves.dis7.entities.mar.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@60094a13;
 * Country: Morocco (MAR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27721
 */
public class LandingCraft extends EntityType
{
    /** Default constructor */
    public LandingCraft()
    {
        setCountry(Country.MOROCCO_MAR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 27721, Landing Craft
    }
}
