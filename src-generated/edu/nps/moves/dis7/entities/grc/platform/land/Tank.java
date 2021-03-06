package edu.nps.moves.dis7.entities.grc.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@54e7df6a;
 * Country: Greece (GRC);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 22792
 */
public class Tank extends EntityType
{
    /** Default constructor */
    public Tank()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 22792, Tank
    }
}
