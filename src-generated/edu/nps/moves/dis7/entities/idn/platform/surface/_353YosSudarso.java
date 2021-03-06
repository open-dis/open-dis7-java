package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7642df8f;
 * Country: Indonesia (IDN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 29643
 */
public class _353YosSudarso extends EntityType
{
    /** Default constructor */
    public _353YosSudarso()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 28859, Frigate (including Corvette)
        setSubCategory((byte)2); // uid 29640, Ahmad Yani Class
        setSpecific((byte)3); // uid 29643, 353 Yos Sudarso
    }
}
