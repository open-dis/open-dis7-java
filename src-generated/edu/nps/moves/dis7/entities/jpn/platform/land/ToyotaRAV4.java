package edu.nps.moves.dis7.entities.jpn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@36676c1a;
 * Country: Japan (JPN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 24871
 */
public class ToyotaRAV4 extends EntityType
{
    /** Default constructor */
    public ToyotaRAV4()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)81); // uid 24863, Car
        setSubCategory((byte)112); // uid 24870, Sports Utility Vehicle (SUV), Economy/Compact (Small)
        setSpecific((byte)1); // uid 24871, Toyota RAV-4
    }
}
