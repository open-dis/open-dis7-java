package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@673e76b3;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 11336
 */
public class CG58PhilippineSea extends EntityType
{
    /** Default constructor */
    public CG58PhilippineSea()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)3); // uid 11323, Guided Missile Cruiser
        setSubCategory((byte)1); // uid 11324, Ticonderoga Class
        setSpecific((byte)12); // uid 11336, CG 58 Philippine Sea
    }
}
