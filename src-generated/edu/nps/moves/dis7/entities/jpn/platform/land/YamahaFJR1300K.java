package edu.nps.moves.dis7.entities.jpn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5b64c4b7;
 * Country: Japan (JPN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27927
 */
public class YamahaFJR1300K extends EntityType
{
    /** Default constructor */
    public YamahaFJR1300K()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)80); // uid 24860, Motorcycle
        setSubCategory((byte)2); // uid 24861, Sport/Street (Mid-Size)
        setSpecific((byte)2); // uid 27927, Yamaha FJR1300K
    }
}
