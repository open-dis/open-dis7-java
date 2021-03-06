package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@623e088f;
 * Country: Indonesia (IDN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 31666
 */
public class _509TelukRatai extends EntityType
{
    /** Default constructor */
    public _509TelukRatai()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 31090, Tank Landing Ship
        setSubCategory((byte)5); // uid 31664, Teluk Langsa Class
        setSpecific((byte)2); // uid 31666, 509 Teluk Ratai
    }
}
