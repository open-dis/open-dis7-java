package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7ea08277;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 13907
 */
public class SSV411FedorGolovinexSSV520Meridian extends EntityType
{
    /** Default constructor */
    public SSV411FedorGolovinexSSV520Meridian()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 13805, Auxiliary
        setSubCategory((byte)14); // uid 13901, Vishnya class (AGIs)
        setSpecific((byte)6); // uid 13907, SSV 411 Fedor Golovin (ex-SSV 520 Meridian)
    }
}
