package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4b34fff9;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16464
 */
public class Sellinex592 extends EntityType
{
    /** Default constructor */
    public Sellinex592()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 16416, Light/patrol craft
        setSubCategory((byte)5); // uid 16462, Sassnitz class (Coast Guard vessels)
        setSpecific((byte)2); // uid 16464, Sellin (ex-592)
    }
}
