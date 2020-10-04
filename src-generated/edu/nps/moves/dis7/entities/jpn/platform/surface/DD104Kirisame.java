package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@d5ae57e
 * Country: Japan (JPN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 29514
 */
public class DD104Kirisame extends EntityType
{
    public DD104Kirisame()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)5); // uid 18890, Destroyer (DD)
        setSubCategory((byte)8); // uid 18898, Murasame Class
        setSpecific((byte)4); // uid 29514, DD-104 Kirisame
    }
}