package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@635572a7;
 * Country: Indonesia (IDN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 31102
 */
public class _542TelukSangkulirang extends EntityType
{
    /** Default constructor */
    public _542TelukSangkulirang()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 31090, Tank Landing Ship
        setSubCategory((byte)1); // uid 31091, Teluk Gilimanuk Class (Frosch I Configuration)
        setSpecific((byte)11); // uid 31102, 542 Teluk Sangkulirang
    }
}
