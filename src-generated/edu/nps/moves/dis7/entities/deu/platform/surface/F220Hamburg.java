package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@37fb0bed;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16414
 */
public class F220Hamburg extends EntityType
{
    /** Default constructor */
    public F220Hamburg()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 16397, Guided Missile Frigate
        setSubCategory((byte)3); // uid 16412, Sachsen Class (Type 124) (FFG)
        setSpecific((byte)2); // uid 16414, F220 Hamburg
    }
}
