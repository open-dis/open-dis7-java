package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@419a20a6;
 * Country: Japan (JPN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 29508
 */
public class DD156Setogiri extends EntityType
{
    /** Default constructor */
    public DD156Setogiri()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)5); // uid 18890, Destroyer (DD)
        setSubCategory((byte)3); // uid 18893, Asagiri Class (DD)
        setSpecific((byte)6); // uid 29508, DD-156 Setogiri
    }
}
