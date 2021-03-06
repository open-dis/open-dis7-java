package edu.nps.moves.dis7.entities.jpn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@72445aba;
 * Country: Japan (JPN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 24860
 */
public class Motorcycle extends EntityType
{
    /** Default constructor */
    public Motorcycle()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)80); // uid 24860, Motorcycle
    }
}
