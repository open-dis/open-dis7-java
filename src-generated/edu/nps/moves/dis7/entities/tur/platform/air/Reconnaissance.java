package edu.nps.moves.dis7.entities.tur.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@698fee9a;
 * Country: Turkey (TUR);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 30597
 */
public class Reconnaissance extends EntityType
{
    /** Default constructor */
    public Reconnaissance()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)7); // uid 30597, Reconnaissance
    }
}
