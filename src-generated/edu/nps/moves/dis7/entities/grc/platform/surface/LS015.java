package edu.nps.moves.dis7.entities.grc.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@8c3619e;
 * Country: Greece (GRC);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23364
 */
public class LS015 extends EntityType
{
    /** Default constructor */
    public LS015()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)63); // uid 23361, Coast Guard Boats
        setSubCategory((byte)1); // uid 23362, Dilos class
        setSpecific((byte)2); // uid 23364, LS 015
    }
}
