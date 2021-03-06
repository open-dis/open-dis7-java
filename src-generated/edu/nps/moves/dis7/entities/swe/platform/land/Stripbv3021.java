package edu.nps.moves.dis7.entities.swe.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@68d651f2;
 * Country: Sweden (SWE);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27676
 */
public class Stripbv3021 extends EntityType
{
    /** Default constructor */
    public Stripbv3021()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 17470, Armored Fighting Vehicle
        setSubCategory((byte)2); // uid 17472, Pansarbandvagn 302 (Pbv 302)
        setSpecific((byte)2); // uid 27676, Stripbv 3021
    }
}
