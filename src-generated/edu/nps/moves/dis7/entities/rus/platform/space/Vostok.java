package edu.nps.moves.dis7.entities.rus.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@34acbc60
 * Country: Russia (RUS)
 * Entity kind: Platform
 * Domain: SPACE
 *
 * Entity type uid: 14842
 */
public class Vostok extends EntityType
{
    public Vostok()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)1); // uid 14828, Manned
        setSubCategory((byte)3); // uid 14835, Space vehicles
        setSpecific((byte)7); // uid 14842, Vostok
    }
}