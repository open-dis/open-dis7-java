package edu.nps.moves.dis7.entities.rus.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@102efc59;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SPACE;
 *
 * Entity type uid: 14868
 */
public class C2002 extends EntityType
{
    /** Default constructor */
    public C2002()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 14850, Unmanned
        setSubCategory((byte)10); // uid 14866, Minor military satellite
        setSpecific((byte)2); // uid 14868, C2002
    }
}
