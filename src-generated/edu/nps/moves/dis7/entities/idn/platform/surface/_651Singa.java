package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3ed242a4
 * Country: Indonesia (IDN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 31046
 */
public class _651Singa extends EntityType
{
    public _651Singa()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 31038, Light/Patrol Craft
        setSubCategory((byte)6); // uid 31044, Andau Class (FPB 57 Variant II)
        setSpecific((byte)2); // uid 31046, 651 Singa
    }
}
