package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@269f4bad;
 * Country: Italy (ITA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24458
 */
public class TankerGroup3Merchant extends EntityType
{
    /** Default constructor */
    public TankerGroup3Merchant()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24458, Tanker (Group 3 Merchant)
    }
}
