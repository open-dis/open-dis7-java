package edu.nps.moves.dis7.entities.swe.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4a67b4ec;
 * Country: Sweden (SWE);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27679
 */
public class Rlpbv3024 extends EntityType
{
    /** Default constructor */
    public Rlpbv3024()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 17470, Armored Fighting Vehicle
        setSubCategory((byte)2); // uid 17472, Pansarbandvagn 302 (Pbv 302)
        setSpecific((byte)5); // uid 27679, Rlpbv 3024
    }
}
