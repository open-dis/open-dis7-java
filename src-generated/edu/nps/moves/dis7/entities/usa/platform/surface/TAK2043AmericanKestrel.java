package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@681c0ae6;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 11830
 */
public class TAK2043AmericanKestrel extends EntityType
{
    /** Default constructor */
    public TAK2043AmericanKestrel()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 11770, Auxiliary, Merchant Marine
        setSubCategory((byte)10); // uid 11828, Lash (Preposition)
        setSpecific((byte)2); // uid 11830, TAK 2043 American Kestrel
    }
}
