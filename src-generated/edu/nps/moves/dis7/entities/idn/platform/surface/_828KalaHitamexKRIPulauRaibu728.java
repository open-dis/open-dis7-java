package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@43f82e78;
 * Country: Indonesia (IDN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 31067
 */
public class _828KalaHitamexKRIPulauRaibu728 extends EntityType
{
    /** Default constructor */
    public _828KalaHitamexKRIPulauRaibu728()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 31038, Light/Patrol Craft
        setSubCategory((byte)3); // uid 31066, Kondor II Class (Patrol Duty Configuration)
        setSpecific((byte)1); // uid 31067, 828 Kala Hitam - (ex-KRI Pulau Raibu 728)
    }
}
