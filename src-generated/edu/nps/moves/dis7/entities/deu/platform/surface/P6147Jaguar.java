package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2b175c00
 * Country: Germany (DEU)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 16446
 */
public class P6147Jaguar extends EntityType
{
    public P6147Jaguar()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 16416, Light/patrol craft
        setSubCategory((byte)3); // uid 16439, Tiger Class (Type 148)
        setSpecific((byte)7); // uid 16446, P6147Jaguar
    }
}
