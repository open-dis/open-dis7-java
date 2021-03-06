package edu.nps.moves.dis7.entities.can.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@78e67e0a;
 * Country: Canada (CAN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30979
 */
public class WGGeorge817949 extends EntityType
{
    /** Default constructor */
    public WGGeorge817949()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)63); // uid 26272, Coast Guard Boats
        setSubCategory((byte)2); // uid 30971, Arun-class lifeboat
        setSpecific((byte)8); // uid 30979, W.G. George (817949)
    }
}
