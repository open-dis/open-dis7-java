package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@663411de
 * Country: Indonesia (IDN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 31665
 */
public class _503TelukAmboina extends EntityType
{
    public _503TelukAmboina()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 31090, Tank Landing Ship
        setSubCategory((byte)5); // uid 31664, Teluk Langsa Class
        setSpecific((byte)1); // uid 31665, 503 Teluk Amboina
    }
}
