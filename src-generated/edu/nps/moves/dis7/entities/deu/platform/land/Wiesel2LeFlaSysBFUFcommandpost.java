package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1a5b6f42;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 22770
 */
public class Wiesel2LeFlaSysBFUFcommandpost extends EntityType
{
    /** Default constructor */
    public Wiesel2LeFlaSysBFUFcommandpost()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 16321, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)3); // uid 22769, Wiesel 2 LeFlaSys (SAM)
        setSpecific((byte)1); // uid 22770, Wiesel 2 LeFlaSys BF/UF command post
    }
}
