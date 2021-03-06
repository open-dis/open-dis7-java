package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@54562ea6;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 31772
 */
public class GRANAT4 extends EntityType
{
    /** Default constructor */
    public GRANAT4()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)50); // uid 23446, Unmanned
        setSubCategory((byte)3); // uid 31770, GRANAT Series UAVs
        setSpecific((byte)4); // uid 31772, GRANAT 4
    }
}
