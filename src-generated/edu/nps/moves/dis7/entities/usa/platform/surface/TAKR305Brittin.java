package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@50fdf44f;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 26377
 */
public class TAKR305Brittin extends EntityType
{
    /** Default constructor */
    public TAKR305Brittin()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 11770, Auxiliary, Merchant Marine
        setSubCategory((byte)24); // uid 26371, T-AKR Bob Hope
        setSpecific((byte)6); // uid 26377, T-AKR-305 Brittin
    }
}
