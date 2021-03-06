package edu.nps.moves.dis7.entities.pak.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@6bfdb014;
 * Country: Pakistan (PAK);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27162
 */
public class SelfPropelledArtillery extends EntityType
{
    /** Default constructor */
    public SelfPropelledArtillery()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 27162, Self-Propelled Artillery
    }
}
