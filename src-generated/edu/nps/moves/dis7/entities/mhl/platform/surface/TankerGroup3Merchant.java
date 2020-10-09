package edu.nps.moves.dis7.entities.mhl.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@3deb2326
 * Country: Marshall Islands (MHL)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 24572
 */
public class TankerGroup3Merchant extends EntityType
{
    public TankerGroup3Merchant()
    {
        setCountry(Country.MARSHALL_ISLANDS_MHL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24572, Tanker (Group 3 Merchant)
    }
}
