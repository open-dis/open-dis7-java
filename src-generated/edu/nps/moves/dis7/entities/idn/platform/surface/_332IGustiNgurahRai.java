package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@a22cb6a;
 * Country: Indonesia (IDN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30513
 */
public class _332IGustiNgurahRai extends EntityType
{
    /** Default constructor */
    public _332IGustiNgurahRai()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 27393, Guided Missile Frigate (FFG)
        setSubCategory((byte)2); // uid 30511, Martadinata Class (SIGMA 10514)
        setSpecific((byte)2); // uid 30513, 332 I Gusti Ngurah Rai
    }
}
