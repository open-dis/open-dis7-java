package edu.nps.moves.dis7.entities.zaf.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@782be4eb;
 * Country: South Africa (ZAF);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 19105
 */
public class TowedArtillery extends EntityType
{
    /** Default constructor */
    public TowedArtillery()
    {
        setCountry(Country.SOUTH_AFRICA_ZAF);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 19105, Towed Artillery
    }
}
