package edu.nps.moves.dis7.entities.jpn.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@675d8c96;
 * Country: Japan (JPN);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 31805
 */
public class SS504Kenryu extends EntityType
{
    /** Default constructor */
    public SS504Kenryu()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)11); // uid 31800, SSP (Attack Submarine - Diesel Air-Independent Propulsion)
        setSubCategory((byte)1); // uid 31801, Soryu Class
        setSpecific((byte)4); // uid 31805, SS-504 Kenryu
    }
}
